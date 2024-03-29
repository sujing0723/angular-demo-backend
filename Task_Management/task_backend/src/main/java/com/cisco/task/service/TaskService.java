package com.cisco.task.service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cisco.task.dao.TaskDao;
import com.cisco.task.entity.TaskEntity;

@Service
public class TaskService {

	@Autowired
	private TaskDao taskDao;
	
	public List<TaskEntity> getTasks(int id) {
		// TODO Auto-generated method stub
		return taskDao.selectTasks(id);
	}

	public int createTask(TaskEntity task) {
		Date date = new Date();//系统时间
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");//格式化时间
		String time = sdf.format(date);
		task.setTime(time);
		return taskDao.addTask(task);
		
	}

	public int updateTask(TaskEntity task) {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String time = sdf.format(date);
		task.setTime(time);
		return taskDao.editTask(task);
	}

	public TaskEntity getTask(int id) {
		// TODO Auto-generated method stub
		return taskDao.selectTask(id);
	}

	public int updateTasks(TaskEntity task) {
		// TODO Auto-generated method stub
		return taskDao.updateTasks(task);
	}

	public List<TaskEntity> getTasksForAdmin() {
		// TODO Auto-generated method stub
		return taskDao.getTasksForAdmin();
	}
	

}
