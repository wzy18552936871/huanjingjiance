package com.environmentalmonitoring.springcloud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.environmentalmonitoring.springcloud.entities.City;
import com.environmentmonitoring.springcloud.pojo.CityBar;

@RestController
public class CityController_Consumer {
	private static final String REST_URL_PREFIX="http://ENVIRONMENTALMONITORINGSPRINGCLOUD-CITY8002";
	@Autowired
	private RestTemplate restTemplate;
	
	@SuppressWarnings("unchecked")
	@RequestMapping(value="/consumer/city/list")
	public List<City> list() {
		return restTemplate.getForObject(REST_URL_PREFIX+"/city/list", List.class);
		
	}
	@SuppressWarnings("unchecked")
	@RequestMapping(value="/consumer/city/barList")
	public List<CityBar> pm2_5list() {
		return restTemplate.getForObject(REST_URL_PREFIX+"/city/barList", List.class);
		
	}

}
