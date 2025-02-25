package com.example.SpringBootRest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class HomeController {


    @Autowired
    StudentRepository studentRepository;




    @PostMapping("/studets")
    public void postStudents(){
        List<Student> students = new ArrayList<>();
        Student s1= new Student();
        s1.setId(101);
        s1.setName("Adesh");


        Student s2= new Student();
        s2.setId(102);
        s2.setName("Vedika");

        students.add(s1);
        students.add(s2);
        studentRepository.saveAll(students);
    }
}
