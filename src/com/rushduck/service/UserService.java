package com.rushduck.service;

import java.util.List;

import com.rushduck.bean.User;

public interface UserService {
	//��½ҵ��
	public User login(String username, String password);
	
	//ע��ҵ��
	public boolean register(User user);
	
	//�ж��Ƿ����ĳ����
	public boolean isExist(String username);
	
	//����ID��ȡĳ���û��Ļ�����Ϣ
	public User getUserById(Integer userId);
	
	//��ȡ�����û�
	public List<User> getAllUsers();
	
	//�����û���Ϣ
	public boolean updateUser(User user);
}