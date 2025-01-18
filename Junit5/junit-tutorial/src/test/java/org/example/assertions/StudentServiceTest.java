package org.example.assertions;

import org.example.Student;
import org.example.StudentService;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StudentServiceTest {

    @Test
    void getStudents() {
        StudentService studentService = new StudentService();
        List<Student> listOfStudents = studentService.getStudents();
        boolean actualResult = listOfStudents.isEmpty();
        assertTrue(actualResult);
//        Student student = new Student(26,"Adesh");
//        studentService.addStudent(student);
        listOfStudents = studentService.getStudents();
        actualResult = listOfStudents.isEmpty();
//        assertTrue(actualResult);
//        assertTrue(actualResult, "Students present in a list");


//        assertFalse(actualResult);
//        assertFalse(actualResult,"Students not present in a list");

    }


    @Test
    void getStudentById() {
        StudentService studentService = new StudentService();
        Student student = new Student(26,"Adesh");
        studentService.addStudent(student);
        Student student1 = studentService.getStudentById(26);

//        assertNull(student1);
//        assertNull(student1,"Student is present");
//        assertNull(student1,()->"Student is present");

//        assertNotNull(student1);
//        assertNotNull(student1,"Student is not present");
        assertNotNull(student1,()->"Student is not present");

    }
}
