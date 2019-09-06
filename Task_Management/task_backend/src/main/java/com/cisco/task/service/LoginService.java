package com.cisco.task.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cisco.task.dao.LoginDao;
import com.cisco.task.entity.UserEntity;

@Service
public class LoginService {
	@Autowired
	private LoginDao loginDao;
	
	public UserEntity login(UserEntity user) {
		return loginDao.login(user);
	}

}
