package com.cisco.task.dao;

import java.util.List;

import com.cisco.task.entity.UserEntity;

public interface UserDao {
	public List<UserEntity> selectUserList();

	public int insertUser(UserEntity user);

	public UserEntity selectUser(int id);

	public int updateUser(UserEntity user);

	public int deleteUser(int id);

	public List<UserEntity> selectOperaterUserList();
}
