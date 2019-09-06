package com.cisco.task.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cisco.task.dao.UserDao;
import com.cisco.task.entity.UserEntity;

@Service
public class UserService {

	@Autowired
	private UserDao userDao;
	
	public List<UserEntity> getUserList(){
		return userDao.selectUserList();
	}

	public int createuser(UserEntity user) {
		// TODO Auto-generated method stub
		return userDao.insertUser(user);
	}

	public UserEntity getuser(int id) {
		// TODO Auto-generated method stub
		return userDao.selectUser(id);
	}
	
	public int updateUser(UserEntity user) {
		// TODO Auto-generated method stub
		return userDao.updateUser(user);
	}

	public int deleteUser(int id) {
		// TODO Auto-generated method stub
		return userDao.deleteUser(id);
	}

	public List<UserEntity> getOperaterUserList() {
		// TODO Auto-generated method stub
		return userDao.selectOperaterUserList();
	}
	
}
