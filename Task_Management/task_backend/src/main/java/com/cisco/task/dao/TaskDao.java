package com.cisco.task.dao;

import java.util.List;

import com.cisco.task.entity.TaskEntity;
//mybatis jdbc
public interface TaskDao {

	List<TaskEntity> selectTasks(int id);

	int addTask(TaskEntity task);

	int editTask(TaskEntity task);

	TaskEntity selectTask(int id);

	int updateTasks(TaskEntity task);

	List<TaskEntity> getTasksForAdmin();

}
