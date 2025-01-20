package org.example;

import java.sql.*;

public class Demo {
    public static void main(String[] args) throws Exception {
        StudentDAO studentDAO = new StudentDAO();
        Student student = studentDAO.getStudent(1);
        System.out.println(student);

        Student student1 = new Student();
        student1.rollNo = 11;
        student1.name = "Pushkar";
        student1.email = "pushkar@gmail.com";
        studentDAO.addStudent(student1);
    }
}


class StudentDAO {
    static Connection connection;
    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");// load the class so that all static methods can get executed
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC_learning", "root", "password");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public Student getStudent(int rollNo) {
        Student student = new Student();
        student.rollNo = rollNo;
        student.name = getName();
        student.email = getEmail();
        return student;
    }

    public void addStudent(Student student) throws SQLException {
        String query = "INSERT INTO student values (?,?,?);";
        try{
            PreparedStatement preparedStatement = getPreparedStatement(query);
            preparedStatement.setInt(1, student.rollNo);
            preparedStatement.setString(2, student.name);
            preparedStatement.setString(3, student.email);
            int count = preparedStatement.executeUpdate();
            System.out.println(count+" row/s affected.");
            preparedStatement.close();
        }
        catch (Exception e) {
            System.out.println();
        }
    }

    private String getName() {
        try {
            Statement statement = getStatement();
            String query = "SELECT * FROM student WHERE sid = 1";
            ResultSet rs = statement.executeQuery(query);
            rs.next();
            String name = rs.getString("sname");
            statement.close();
            return name;
        } catch (Exception e) {
            System.out.println();
        }
        return null;
    }


    private String getEmail() {
        try {
            Statement statement = getStatement();
            String query = "SELECT * FROM student WHERE sid = 1";
            ResultSet rs = statement.executeQuery(query);
            rs.next();
            String email = rs.getString("semail");
            ;
            statement.close();
            return email;
        } catch (Exception e) {
            System.out.println();
        }
        return null;
    }

    private Statement getStatement() throws ClassNotFoundException, SQLException {
        Statement statement = connection.createStatement();
        return statement;
    }

    private PreparedStatement getPreparedStatement(String query) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        return preparedStatement;
    }
}


class Student {
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
