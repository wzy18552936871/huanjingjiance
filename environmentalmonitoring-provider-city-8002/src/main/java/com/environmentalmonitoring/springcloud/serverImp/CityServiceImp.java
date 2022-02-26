package com.environmentalmonitoring.springcloud.serverImp;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import com.environmentalmonitoring.springcloud.Data.RequestData;
import com.environmentalmonitoring.springcloud.dao.CityDao;
import com.environmentalmonitoring.springcloud.entities.City;
import com.environmentalmonitoring.springcloud.server.CityService;
import com.environmentmonitoring.springcloud.pojo.CityBar;
@Service
public class CityServiceImp implements CityService {
	@Autowired
	private CityDao cityDao;

	
	@Override
	public boolean add(City city) {
		// TODO Auto-generated method stub
		return cityDao.insertCity(city);
	}

	@Override
	public List<City> list() {
		// TODO Auto-generated method stub
		return cityDao.findAll();
	}

	@Override
	public List<City> getByName(String data_city_name) {
		List<City> lc=new ArrayList<City>();
		
		return cityDao.findByName(data_city_name);
	}

	@Override
	public boolean update(City city,int data_city_id) {
		
		return cityDao.updateCity(city, data_city_id);
	}

	@Override
	public List<City> findData() {
		// TODO Auto-generated method stub
		return cityDao.findData();
	}

	@Override
	public List<CityBar> barList() {
		List<CityBar> lcb=new ArrayList<CityBar>();
		Set<String> cityName=new HashSet<String>();
		List<City> lc =this.list();
		for(City c : lc) {
			cityName.add(c.getData_city());
		}
		for(String name:cityName) {
			CityBar cb=new CityBar();
			List<City> lcn=this.getByName(name);
			List<Double> data_o324=new ArrayList<Double>();
			List<Double> data_pm2_5=new ArrayList<Double>();
			Set<Date> data_time=new HashSet<Date>();
			for(City c:lcn) {
				data_o324.add(c.getData_o324());
				data_pm2_5.add(c.getData_pm2_5());
				data_time.add(c.getData_time());	
			}
			cb.setData_city(name);
			cb.setData_O324(data_o324);
			cb.setData_pm2_5(data_pm2_5);
			cb.setData_time(data_time);
			lcb.add(cb);
		}

		return lcb;
	}
	@Scheduled(cron="0 0 8,12,17 * * *")
	public void FindData() {
		try {
		RequestData rd = new RequestData();
		ArrayList<String> cName=new ArrayList<String>();
		cName.add("北京");
		cName.add("上海");
		cName.add("广州");
		cName.add("南京");
		cName.add("西安");
		for (int i=0;i<cName.size();i++) {
			City city=new City();
			System.out.println(rd.Get(cName.get(i)).getData_city_id());
			city.setData_city_id(rd.Get(cName.get(i)).getData_city_id());
			city.setData_city(rd.Get(cName.get(i)).getData_city());
			city.setData_color(rd.Get(cName.get(i)).getData_color());
			city.setData_o324(rd.Get(cName.get(i)).getData_o324());
			city.setData_pm2_5(rd.Get(cName.get(i)).getData_pm2_5());
			city.setData_pm2_524(rd.Get(cName.get(i)).getData_pm2_524());
			city.setData_time(rd.Get(cName.get(i)).getData_time());
			city.setData_quality(rd.Get(cName.get(i)).getData_quality());
			this.add(city);	
			System.out.println(city.toString());
		}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}


}
