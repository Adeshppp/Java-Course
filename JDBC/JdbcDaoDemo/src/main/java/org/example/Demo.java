package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Demo {
    public static void main(String[] args) throws Exception {
        StudentDAO studentDAO = new StudentDAO();
        Student student= studentDAO.getStudent(1);
        System.out.println(student);

    }
}


class Student{
    int rollNo;

    String name;
    String email;

    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}

class StudentDAO{


    public Student getStudent(int rollNo) throws Exception {
        Student student = new Student();
        student.rollNo = rollNo;
        student.name = getName();
        student.email = getEmail();
        return student;
    }

    private String getName() throws Exception{

        Class.forName("com.mysql.cj.jdbc.Driver");// load the class so that all static methods can get executed
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC_learning","root","password");
        Statement statement = connection.createStatement();
        String query = "SELECT * FROM student WHERE sid = 1";
        ResultSet rs = statement.executeQuery(query);
        rs.next();
        return rs.getString("sname");
    }
    private String getEmail() throws Exception{

        Class.forName("com.mysql.cj.jdbc.Driver");// load the class so that all static methods can get executed
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC_learning","root","password");
        Statement statement = connection.createStatement();
        String query = "SELECT * FROM student WHERE sid = 1";
        ResultSet rs = statement.executeQuery(query);
        rs.next();
        return rs.getString("semail");
    }
}
