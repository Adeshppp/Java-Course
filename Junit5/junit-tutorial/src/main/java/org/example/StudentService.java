package org.example;

import java.util.ArrayList;
import java.util.List;

public class StudentService {
    List<Student> students = new ArrayList<>();

    public List<Student> getStudents(){
        return students;
    }

    public void addStudent(Student student){
        students.add(student);
    }

    public Student getStudentById(int studentId){
        return students.stream()
                .filter(student -> student.getAge() == studentId)
                .findFirst()
                .orElse(null);
    }

    public Student getStudentByName(String name){
        return students.stream().filter(student -> student.getName().equals(name)).findFirst().orElseThrow(()-> new StudentNotFoundException("Student is not there"));
    }
}
