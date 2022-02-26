package com.environmentalmonitoring.springcloud.serverImp;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.environmentalmonitoring.springcloud.dao.UserDao;
import com.environmentalmonitoring.springcloud.entities.User;
import com.environmentalmonitoring.springcloud.server.UserService;

@Service
public class UserServiceImp implements UserService {
	
	@Autowired
	private UserDao userDao;
	
	@Override
	public boolean add(User user) {
		return userDao.addUser(user);
	} 

	@Override
	public boolean delete(int id) {
		return userDao.deleteUser(id);
	}

	@Override
	public User get(int id) {
		return userDao.findById(id);
	}

	@Override
	public List<User> list() {
		return userDao.findAll();
	}

	@Override
	public boolean update(int id, String newPublish) {
		// TODO Auto-generated method stub
		return userDao.updateUser(id, newPublish);
	}

	@Override
	public boolean updateUserInfo(User user, int user_id) {
		// TODO Auto-generated method stub
		return userDao.updateUserInfo(user, user_id);
	}

	@Override
	public User getByUsername(String username,String password) {
		// TODO Auto-generated method stub
		return userDao.findByUsername(username,password);
	}



}
