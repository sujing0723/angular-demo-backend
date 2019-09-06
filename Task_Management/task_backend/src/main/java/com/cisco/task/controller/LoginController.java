package com.cisco.task.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cisco.task.dto.ResultDto;
import com.cisco.task.dto.UserDto;
import com.cisco.task.entity.UserEntity;
import com.cisco.task.service.LoginService;

@RestController
public class LoginController {
	@Autowired
	private LoginService loginService;
	
	
	@PostMapping("/login")
	public UserEntity login(@RequestBody UserEntity user,HttpServletRequest request) {
		HttpSession session = request.getSession();
		UserEntity userEntity = new UserEntity();
		userEntity = loginService.login(user);
		if(userEntity != null) {
			session.setAttribute("key", userEntity);
		}
		return userEntity;
		
	}
}
