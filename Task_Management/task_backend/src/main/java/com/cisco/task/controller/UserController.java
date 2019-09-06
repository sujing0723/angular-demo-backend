package com.cisco.task.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cisco.task.dto.ResultDto;
import com.cisco.task.entity.UserEntity;
import com.cisco.task.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userService;
	
	@GetMapping("/list")
	public List<UserEntity> getUserList() {
		return userService.getUserList();
	}
	
	@GetMapping("/list/operater")
	public List<UserEntity> getOperaterUserList() {
		return userService.getOperaterUserList();
	}
	
	@PostMapping("/add")
	public ResultDto adduser(@RequestBody UserEntity user) {
		int insert = userService.createuser(user);
		ResultDto result = new ResultDto();
		if(insert == 1) {
			result.setSuccess(true);
		}else {
			result.setSuccess(false);
		}
		return result;
	}
	
	@PostMapping("/one")
	public UserEntity getuser(@RequestBody int id) {
		UserEntity user = userService.getuser(id);
		return user;	
	}
	
	@PostMapping("/edit")
	public ResultDto edituser(@RequestBody UserEntity user) {
		int update = userService.updateUser(user);
		ResultDto result = new ResultDto();
		if(update == 1) {
			result.setSuccess(true);
		}else {
			result.setSuccess(false);
		}
		return result;
	}
	
	@PostMapping("/delete")
	public ResultDto deleteuser(@RequestBody int id) {
		int delete = userService.deleteUser(id);
		ResultDto result = new ResultDto();
		if(delete == 1) {
			result.setSuccess(true);
		}else {
			result.setSuccess(false);
		}
		return result;
	}
	
	@PostMapping("/batch/delete")
	public ResultDto deleteUsers(@RequestBody List<UserEntity> users) {
		ResultDto result = new ResultDto();
		for(UserEntity user: users) {
			int delete = userService.deleteUser(user.getUserId());
			if(delete == 1) {
				result.setSuccess(true);
			}else {
				result.setSuccess(false);
			}
		}
		return result;
	}
}
