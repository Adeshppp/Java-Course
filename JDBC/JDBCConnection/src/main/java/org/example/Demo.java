package org.example;

import java.sql.*;

public class Demo {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String url = "jdbc:mysql://localhost:3306/JDBC_learning";
        String user = "root";
        String pass = "password";
//        String query = "SELECT * FROM student where sid = 1";
        String query = "SELECT * FROM student";
        Statement st = null;
        Connection con = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver"); // just load the class
            con = DriverManager.getConnection(url, user, pass);
            st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            while(rs.next()){
                System.out.println("Id of "+rs.getString("sname")+" is "+rs.getInt("sid")+" and email id is "+rs.getString("semail"));
            }

        }catch(Exception e){
            System.out.println("Exception "+ e);
        }
        finally{
        st.close();
        con.close();

        }

    }
}
