package com.rushduck.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.rushduck.bean.User;
import com.rushduck.bean.UserExample;
import com.rushduck.mapper.UserMapper;
import com.rushduck.utils.PasswordEncryptor;
import com.sun.istack.internal.NotNull;

public class UserServiceImpl implements UserService{
	//Service层依赖Dao层
	private UserMapper userMapper;
	
	public void setUserMapper(UserMapper userMapper) {
		this.userMapper = userMapper;
	}

	@Override
	@Transactional(isolation = Isolation.DEFAULT, propagation = Propagation.REQUIRED, readOnly = true)
	public User login(@NotNull String username, @NotNull String password) {
		//TODO 单点登录问题未处理
		UserExample example = new UserExample();
		example.createCriteria().andUsernameEqualTo(username);
		List<User> users = userMapper.selectByExample(example);
		User user = users.size() == 0 ? null : users.get(0);
		if(user != null) {
			String pwd = new PasswordEncryptor(user.getSalt(), "sha-256").encode(password);
			return user.getPassword().equals(pwd) ? user : null;
		}
		return null;
	}

	@Override
	@Transactional(isolation = Isolation.DEFAULT, propagation = Propagation.REQUIRED, readOnly = false)
	public boolean register(User user) {
		if(!isExist(user.getUsername())) {
			int number = userMapper.insertSelective(user);
			System.out.println("操作register : " + number + "行收到影响");
			return true;
		}else {
			System.out.println("注册用户失败");
		}
		return false;
	}

	@Override
	@Transactional(isolation = Isolation.DEFAULT, propagation = Propagation.REQUIRED, readOnly = true)
	public boolean isExist(@NotNull String username) {
		UserExample example = new UserExample();
		example.createCriteria().andUsernameEqualTo(username);
		List<User> users = userMapper.selectByExample(example);
		return users.size() == 0 ? false : true;
	}

	@Override
	@Transactional(isolation = Isolation.DEFAULT, propagation = Propagation.REQUIRED, readOnly = true)
	public User getUserById(Integer userId) {
		User user = userMapper.selectByPrimaryKey(userId);
		return user;
	}

	@Override
	public List<User> getAllUsers() {
		List<User> users = userMapper.selectAllUsers();
		return users;
	}

	@Override
	@Transactional(isolation = Isolation.DEFAULT, propagation = Propagation.REQUIRED, readOnly = false)
	public boolean updateUser(User user) {
		UserExample example = new UserExample();
		example.createCriteria().andUseridEqualTo(user.getUserid());
		int num = userMapper.updateByExampleSelective(user, example);
		return num == 0 ? false : true;
	}

}
