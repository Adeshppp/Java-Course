package org.example;

import java.sql.*;

public class TestConnection {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/", "root", "");
            System.out.println("Connection established successfully!");
            con.close();
        } catch (ClassNotFoundException e) {
            System.err.println("Driver class not found: " + e.getMessage());
        } catch (SQLException e) {
            System.err.println("Connection failed: " + e.getMessage());
        }
    }
}
