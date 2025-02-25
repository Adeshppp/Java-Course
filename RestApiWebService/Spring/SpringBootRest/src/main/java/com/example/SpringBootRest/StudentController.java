package com.example.SpringBootRest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentRepository studentRepository;

    @GetMapping("/students")
    public List<Student> getStudents(){
        List<Student> students = (List<Student>) studentRepository.findAll();

        return students;
    }


    @GetMapping("student/{id}")
    public Student getStudent(@PathVariable("id")  int id){
        Student student = studentRepository.findById(id).orElse(new Student());
        return student;
    }

    @PostMapping("student")
    public Student addStudent(Student student){
        studentRepository.save(student);
        return student;
    }



}
