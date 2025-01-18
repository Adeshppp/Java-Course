package org.example.assertions;

import org.example.Student;
import org.example.StudentService;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class StudentServiceTest {

    @Test
    void getStudents() {
        StudentService studentService = new StudentService();
        List<Student> listOfStudents = studentService.getStudents();
        boolean actualResult = listOfStudents.isEmpty();
        assertTrue(actualResult);
        Student student = new Student(26,"Adesh");
        studentService.addStudent(student);
        listOfStudents = studentService.getStudents();
        actualResult = listOfStudents.isEmpty();
//        assertTrue(actualResult);
//        assertTrue(actualResult, "Students present in a list");


        assertFalse(actualResult);

    }


}
