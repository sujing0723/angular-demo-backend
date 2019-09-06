package com.cisco.task;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.cisco.task.dao")
public class TaskBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(TaskBackendApplication.class, args);
	}

}
