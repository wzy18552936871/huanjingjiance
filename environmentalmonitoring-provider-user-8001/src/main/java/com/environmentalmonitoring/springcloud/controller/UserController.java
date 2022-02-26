package com.environmentalmonitoring.springcloud.controller;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.environmentalmonitoring.springcloud.entities.User;
import com.environmentalmonitoring.springcloud.server.UserService;


@RestController
public class UserController {
	
	@Autowired
	private UserService userService;    
	
	@RequestMapping(value="/user/add",method = RequestMethod.POST)
	public boolean add(@RequestParam("name") String name,
			@RequestParam("password") String password,
			@RequestParam("tel") String tel) {
		Calendar cal = Calendar.getInstance();
		Date d=cal.getTime();
		User user=new User();
		user.setUserName(name);
		user.setPassWord(password);
		user.setTelephone(tel);
		user.setRegister(d);
		user.setPublish(d);
		user.setAuthority(0);
		return userService.add(user);
	}
	@RequestMapping(value="/user/get/{id}",method = RequestMethod.GET)
	public User get(@PathVariable("id") Integer id) {
		return userService.get(id);
	}
	@RequestMapping(value="/user/list",method = RequestMethod.GET)
	public List<User> list() {
		return userService.list();
	}
	@RequestMapping(value="/user/delete/{id}",method = RequestMethod.GET)
	public boolean delete(@PathVariable("id") Integer id) {
		return userService.delete(id);
	}
	@RequestMapping(value="/user/update/{id}",method = RequestMethod.POST)
	public boolean update(@PathVariable("id") Integer id) {
		User u=userService.get(id);
		Date publish=new Date();
		String newpublish=publish.toString();
		return userService.update(id,newpublish);
	}
	@RequestMapping(value="/user/updateInfo/{id}",method = RequestMethod.POST)
	public boolean updateInfo(@PathVariable("id") Integer id,@RequestBody User User) {
		
		return userService.updateUserInfo(User,id);
	}
	@RequestMapping(value = "/user/getByUsername/{username}/{password}",method=RequestMethod.GET)
	public User getByUsername(@PathVariable("username")String username,@PathVariable("password")String password) {
		return userService.getByUsername(username,password);
	}
}
