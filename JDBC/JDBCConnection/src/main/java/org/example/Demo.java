package org.example;

import java.sql.*;

public class Demo {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String url = "jdbc:mysql://localhost:3306/JDBC_learning";
        String userName = "root";
        String pass = "password";
        Class.forName("com.mysql.cj.jdbc.Driver");// load the class so that all static methods can get executed
        Connection connection = DriverManager.getConnection(url, userName, pass);

        //Select query
        String query = "SELECT * FROM student";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(query);
        while (resultSet.next()) {
            System.out.println(resultSet.getInt("sid") + " : " + resultSet.getString("sname") + " : " + resultSet.getString("semail"));
        }


//        Insert Query
//        query = "INSERT INTO student (sid, sname, semail) VALUES (7,'abhi','abhi@gmail.com');";
//        int count = statement.executeUpdate(query);
//        System.out.println(count + " row/s affected.");

        // can also pass parameters dynamically
//        int sid = 8;
//        String sname = "Tanu";
//        String semail = "tanu@gmail.com";
//        query = "INSERT INTO student values (" + sid + ", '" + sname + "', '" + semail + "');";
//        int count = statement.executeUpdate(query);
//        System.out.println(count + " row/s affected.");
        statement.close();

        // as we are passing parameters, in order to make it easy, we can use PreparedStatement
        int sid = 9;
        String sname = "Vedu";
        String semail = "vedu@gmail.com";
        query = "INSERT INTO student values (?,?,?);";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setInt(1, sid);
        preparedStatement.setString(2,sname);
        preparedStatement.setString(3,semail);

        int count = preparedStatement.executeUpdate();
        System.out.println(count + " row/s affected.");

        preparedStatement.close();
        connection.close();


    }
}
