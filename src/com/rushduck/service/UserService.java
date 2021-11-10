package com.rushduck.service;

import java.util.List;

import com.rushduck.bean.User;

public interface UserService {
	//登陆业务
	public User login(String username, String password);
	
	//注册业务
	public boolean register(User user);
	
	//判断是否存在某个人
	public boolean isExist(String username);
	
	//根据ID获取某个用户的基本信息
	public User getUserById(Integer userId);
	
	//获取所有用户
	public List<User> getAllUsers();
	
	//更新用户信息
	public boolean updateUser(User user);
}