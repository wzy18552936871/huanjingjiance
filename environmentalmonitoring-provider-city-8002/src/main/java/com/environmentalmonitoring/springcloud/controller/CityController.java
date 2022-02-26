package com.environmentalmonitoring.springcloud.controller;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.environmentalmonitoring.springcloud.entities.City;
import com.environmentalmonitoring.springcloud.server.CityService;
import com.environmentmonitoring.springcloud.pojo.CityBar;

@RestController
public class CityController {
	@Autowired
	private CityService cityService;
	@RequestMapping(value = "/city/list",method = RequestMethod.GET)
	public List<City> list() {
		return cityService.list();
	}
	@RequestMapping(value = "/city/{name}",method = RequestMethod.GET)
	public List<City> getByName(@PathVariable("name") String name) {
		return cityService.getByName(name);
	}
	@RequestMapping(value = "/city/barList",method = RequestMethod.GET)
	public List<CityBar> barList() {
		return cityService.barList();
	}

	
}

