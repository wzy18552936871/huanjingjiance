package com.environmentalmonitoring.springcloud.Data;

import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import com.environmentalmonitoring.springcloud.entities.City;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class RequestData {
	public static final String APPKEY = "3ec2bad26274acc6";// 浣犵殑appkey
	public static final String URL = "https://api.jisuapi.com/aqi/query";
//	    public static final String city = "苏州";// utf-8

	public static City Get(String cityName) throws Exception {
		City cityData = null;
		String result = null;
		String url = URL + "?appkey=" + APPKEY + "&city=" + URLEncoder.encode(cityName, "utf-8");

		try {
			result = HttpUtil.sendGet(url, "utf-8");
			JSONObject json = JSONObject.fromObject(result);
			if (json.getInt("status") != 0) {
				System.out.println(json.getString("msg"));
				return null;
			} else {
				JSONObject resultarr = json.optJSONObject("result");
				String city = resultarr.getString("city");
				String cityid = resultarr.getString("cityid");
				String o324 = resultarr.getString("o324");
//	                String pm10 = resultarr.getString("pm10");
//	                String pm1024 = resultarr.getString("pm1024");
				String pm2_5 = resultarr.getString("pm2_5");
				String pm2_524 = resultarr.getString("pm2_524");
//	                String iso2 = resultarr.getString("iso2");
//	                String ino2 = resultarr.getString("ino2");
//	                String ico = resultarr.getString("ico");
//	                String io3 = resultarr.getString("io3");
//	                String io38 = resultarr.getString("io38");
//	                String ipm10 = resultarr.getString("ipm10");
//	                String ipm2_5 = resultarr.getString("ipm2_5");
//	                String aqi = resultarr.getString("aqi");
//	                String primarypollutant = resultarr.getString("primarypollutant");
				String quality = resultarr.getString("quality");
				String timepoint = resultarr.getString("timepoint");
//	                System.out.println(cityid + " " + city + " " + so2 + " " + so224 + " " + no2 + " " + no224 + " " + co
//	                        + " " + co24 + " " + o3 + " " + o38 + " " + o324 + " " + pm10 + " " + pm1024 + " " + pm2_5 + " "
//	                        + pm2_524 + " " + iso2 + " " + ino2 + " " + ico + " " + io3 + " " + io38 + " " + ipm10 + " "
//	                        + ipm2_5 + " " + aqi + " " + primarypollutant + " " + quality + " " + timepoint);
				System.out.println(city + " " + cityid+" "+o324 + " " + pm2_5 + " " + pm2_524 + " " + quality + " " + timepoint);
				if (resultarr.opt("aqiinfo") != null) {
					JSONObject aqiinfo = resultarr.optJSONObject("aqiinfo");
					String level = aqiinfo.getString("level");
					String color = aqiinfo.getString("color");
					String affect = aqiinfo.getString("affect");
					String measure = aqiinfo.getString("measure");
					SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
					Date date = sf.parse(timepoint);
					System.out.println(level + " " + color + " " + affect + " " + measure);
					cityData = new City(city,cityid, Double.parseDouble(o324), Double.parseDouble(pm2_5),
							Double.parseDouble(pm2_524), quality, color, date);
					return cityData;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return cityData;
	}

	public static void main(String[] args) {
		RequestData rd = new RequestData();
		try {
			rd.Get("苏州");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
