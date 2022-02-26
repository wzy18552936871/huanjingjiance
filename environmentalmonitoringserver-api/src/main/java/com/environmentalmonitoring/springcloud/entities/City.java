package com.environmentalmonitoring.springcloud.entities;

import java.util.Date;

public class City {
	private int data_id;
	private String data_city_id;
	private String data_city;
	private double data_o324;
	private double data_pm2_524;
	private double data_pm2_5;
	private String data_quality;
	private String data_color;
	private Date data_time;
	private String db_source;
	public City() {
		super();
	}
	
	public City(String data_city, double data_o324, double data_pm2_524, double data_pm2_5, String data_quality,
			String data_color, Date data_time) {
		super();
		this.data_city = data_city;
		this.data_o324 = data_o324;
		this.data_pm2_524 = data_pm2_524;
		this.data_pm2_5 = data_pm2_5;
		this.data_quality = data_quality;
		this.data_color = data_color;
		this.data_time = data_time;
	}

	public City(int data_id, String data_city, double data_o324, double data_pm2_524, double data_pm2_5,
			String data_quality, String data_color, Date data_time) {
		super();
		this.data_id = data_id;
		this.data_city = data_city;
		this.data_o324 = data_o324;
		this.data_pm2_524 = data_pm2_524;
		this.data_pm2_5 = data_pm2_5;
		this.data_quality = data_quality;
		this.data_color = data_color;
		this.data_time = data_time;
	}


	public City(String data_city, String data_city_id, double data_o324, double data_pm2_524, double data_pm2_5,
			String data_quality, String data_color, Date data_time) {
		super();
		this.data_city_id = data_city_id;
		this.data_city = data_city;
		this.data_o324 = data_o324;
		this.data_pm2_524 = data_pm2_524;
		this.data_pm2_5 = data_pm2_5;
		this.data_quality = data_quality;
		this.data_color = data_color;
		this.data_time = data_time;
	}

	public String getData_city_id() {
		return data_city_id;
	}

	public void setData_city_id(String data_city_id) {
		this.data_city_id = data_city_id;
	}
	public int getData_id() {
		return data_id;
	}
	public void setData_id(int data_id) {
		this.data_id = data_id;
	}
	public String getData_city() {
		return data_city;
	}
	public void setData_city(String data_city) {
		this.data_city = data_city;
	}
	public double getData_o324() {
		return data_o324;
	}
	public void setData_o324(double data_o324) {
		this.data_o324 = data_o324;
	}
	public double getData_pm2_524() {
		return data_pm2_524;
	}
	public void setData_pm2_524(double data_pm2_524) {
		this.data_pm2_524 = data_pm2_524;
	}
	public double getData_pm2_5() {
		return data_pm2_5;
	}
	public void setData_pm2_5(double data_pm2_5) {
		this.data_pm2_5 = data_pm2_5;
	}
	public String getData_quality() {
		return data_quality;
	}
	public void setData_quality(String data_quality) {
		this.data_quality = data_quality;
	}
	public String getData_color() {
		return data_color;
	}
	public void setData_color(String data_color) {
		this.data_color = data_color;
	}
	public Date getData_time() {
		return data_time;
	}
	public void setData_time(Date data_time) {
		this.data_time = data_time;
	}
	public String getDb_source() {
		return db_source;
	}

	public void setDb_source(String db_source) {
		this.db_source = db_source;
	}
	@Override
	public String toString() {
		return "City [data_id=" + data_id + ", data_city_id=" + data_city_id + ", data_city=" + data_city
				+ ", data_o324=" + data_o324 + ", data_pm2_524=" + data_pm2_524 + ", data_pm2_5=" + data_pm2_5
				+ ", data_quality=" + data_quality + ", data_color=" + data_color + ", data_time=" + data_time
				+ ", db_source=" + db_source + "]";
	}

	
	
	
}
