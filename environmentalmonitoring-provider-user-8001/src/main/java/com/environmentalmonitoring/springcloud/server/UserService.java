package com.environmentalmonitoring.springcloud.server;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.environmentalmonitoring.springcloud.entities.User;

public interface UserService {
	public boolean add(User user);
	public boolean delete(int id);
	public boolean update(int id,String newPublish);
	public User get(int id);
	public User getByUsername(String username,String password);
	public List<User> list();
	public boolean updateUserInfo(User user,int user_id);
}
