package com.environmentalmonitoring.springcloud.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.environmentalmonitoring.springcloud.entities.City;

@Mapper
public interface CityDao {
	public boolean insertCity(City city);
	public List<City> findAll();	
	public List<City> findByName(String data_city_name);
	public boolean updateCity(@Param("city") City city,@Param("data_city_id") int data_city_id);
	public List<City> findData();
}
