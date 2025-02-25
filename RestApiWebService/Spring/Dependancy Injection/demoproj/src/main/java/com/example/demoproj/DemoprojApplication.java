package com.example.demoproj;

import org.springframework.context.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoprojApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(DemoprojApplication.class, args);
		Student student = context.getBean(Student.class);
		student.code();
	}

}
