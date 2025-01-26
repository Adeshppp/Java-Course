package com.demo.HQL;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestDB {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/Java_course";
        String user = "postgres";
        String password = "password";
        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            System.out.println("Connection Successful!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
