package com.example.SpringJDBCDemo;

import com.example.SpringJDBCDemo.model.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringJdbcDemoApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(SpringJdbcDemoApplication.class, args);
		Student student1= applicationContext.getBean(Student.class);
		student1.setId(111);
		student1.setName("Adesh");
		student1.setTech("Java");

		StudentRepository studentRepository = applicationContext.getBean(StudentRepository.class);
//		studentRepository.save(student1);
		System.out.println(studentRepository.findAll());


	}

}
