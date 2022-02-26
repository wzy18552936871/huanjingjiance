package com.environmentmonitoring.springcloud.pojo;

import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CityBar {
	private  String data_city;
	private List<Double> data_pm2_5;
	private Set<Date> data_time;
	private List<Double> data_O324;
	public List<Double> getData_O324() {
		return data_O324;
	}
	public void setData_O324(List<Double> data_O324) {
		this.data_O324 = data_O324;
	}
	public String getData_city() {
		return data_city;
	}
	public void setData_city(String data_city) {
		this.data_city = data_city;
	}
	public List<Double> getData_pm2_5() {
		return data_pm2_5;
	}
	public void setData_pm2_5(List<Double> data_pm2_5) {
		this.data_pm2_5 = data_pm2_5;
	}
	public Set<Date> getData_time() {
		return data_time;
	}
	public void setData_time(Set<Date> data_time) {
		this.data_time = data_time;
	}
	
}
 