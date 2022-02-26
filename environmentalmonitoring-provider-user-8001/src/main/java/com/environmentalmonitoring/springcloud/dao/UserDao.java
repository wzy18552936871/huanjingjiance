package com.environmentalmonitoring.springcloud.dao;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.environmentalmonitoring.springcloud.entities.User;

@Mapper
public interface UserDao {
	public boolean addUser(User user);
	public boolean deleteUser(int id);
	public boolean updateUser(@Param("user_id") int user_id, @Param("newPublish") String newPublish);
	public User findById(int id);
	public User findByUsername(@Param("username")String username,@Param("password")String password);
	public List<User> findAll();
	public boolean updateUserInfo(@Param("user") User user,@Param("user_id") int user_id);
}
