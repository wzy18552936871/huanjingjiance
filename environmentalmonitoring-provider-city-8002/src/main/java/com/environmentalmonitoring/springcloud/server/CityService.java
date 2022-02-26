package com.environmentalmonitoring.springcloud.server;

import java.util.List;

import com.environmentalmonitoring.springcloud.entities.City;
import com.environmentmonitoring.springcloud.pojo.CityBar;

public interface CityService {
	public boolean add(City city);
	public List<City> list();
	public List<City> getByName(String data_city_name);
	public boolean update(City city,int data_city_id);
	public List<City> findData();
	public List<CityBar> barList();
}
