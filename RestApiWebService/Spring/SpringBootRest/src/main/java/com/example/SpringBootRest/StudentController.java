package com.example.SpringBootRest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentRepository studentRepository;

    @GetMapping(path="/students", produces={"application/xml"})
    public List<Student> getStudents(){
        List<Student> students = (List<Student>) studentRepository.findAll();

        return students;
    }

    //    @PostMapping(path="student", consumes = {MediaType.APPLICATION_JSON_VALUE})
    @PostMapping(path="student", consumes = {"application/xml"})
    public Student addStudent(@RequestBody Student student){
        studentRepository.save(student);
        return student;
    }


    @GetMapping("student/{id}")
    public Student getStudent(@PathVariable("id")  int id){
        Student student = studentRepository.findById(id).orElse(new Student());
        return student;
    }





}
