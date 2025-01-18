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
}
