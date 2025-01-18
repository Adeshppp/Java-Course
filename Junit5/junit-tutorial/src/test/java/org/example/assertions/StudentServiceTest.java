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
    void getStudentByIdByUsingAssertNull() {
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

    @Test
    void getStudentByIdByUsingAssertEquals(){
        StudentService studentService = new StudentService();
        Student student = new Student(26,"Adesh");
        Student student3 = new Student(27,"Nilesh");
        studentService.addStudent(student);
        Student student1 = studentService.getStudentById(26);
        System.out.print(student1);
        assertEquals(student,student1);
//        assertEquals(student,student3,"Both students are different");
//        assertEquals(student.getAge(),student3.getAge(),"Both students have age difference");
        assertEquals(student.getAge(),student1.getAge(),()->"Both students have age difference");

        assertNotEquals(student,student3);
//        assertNotEquals(student,student3,"Both students are different");
//        assertNotEquals(student.getAge(),student3.getAge(),"Both students have age difference");
        assertNotEquals(student.getAge(),student3.getAge(),()->"Both students have age difference");


    }

    @Test
    void getStudentByNameByUsingAssertThrows() {
        StudentService studentService = new StudentService();
        Student student = new Student(26,"Adesh");
        Student student3 = new Student(27,"Nilesh");
        studentService.addStudent(student);
        Student student1 = studentService.getStudentById(26);
//        assertThrows(StudentNotFoundException.class,()->studentService.getStudentByName("Adesh"));
//        assertThrows(StudentNotFoundException.class,()->studentService.getStudentByName("Adesh"),"Student is absent");
//        assertThrows(StudentNotFoundException.class,()->studentService.getStudentByName("Adesh"),()->"Student is absent");
        assertThrows(RuntimeException.class,()->studentService.getStudentByName("Nilesh"),()->"Student is absent");
        assertDoesNotThrow(()->studentService.getStudentByName("Nilesh"),"Student is absent");
    }
}
