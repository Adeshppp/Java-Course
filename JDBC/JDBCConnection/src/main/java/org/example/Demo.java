package org.example;

import java.sql.*;

public class Demo {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String url = "jdbc:mysql://localhost:3306/JDBC_learning";
        String user = "root";
        String pass = "password";
        String query = "SELECT * FROM student where sid = 1";
        Statement st = null;
        Connection con = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver"); // just load the class
            con = DriverManager.getConnection(url, user, pass);
            st = con.createStatement();
            ResultSet resultSet = st.executeQuery(query);
            resultSet.next();
            String name = resultSet.getString("sname");
            System.out.println("Name is "+name);
        }catch(Exception e){
            System.out.println("Exception "+ e);
        }
        finally{
        st.close();
        con.close();

        }

    }
}
