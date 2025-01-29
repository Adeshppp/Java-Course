package com.demo.demorest;

import java.util.ArrayList;
import java.util.List;
import java.sql.*;

public class AlienRepository {
	List<Alien> aliens;
	Connection con = null;
	public AlienRepository() {
		String url = "jdbc:mysql://localhost:3306/Java_course";
		String userName = "root";
		String password = "password";
		try{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url, userName, password);
		}
		catch(Exception e) {
			System.out.println("exception caught "+e);
		}
		
	}
	
	public List<Alien> getAliens() {
		List<Alien> aliens = new ArrayList<>();
		String sql = "SELECT * FROM alien";
		try {
			System.out.println("getAliens called in repo");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			while(rs.next()) {
				Alien alien = new Alien();
				alien.setId(rs.getInt(1));
				alien.setName(rs.getString(2));
				alien.setPoints(rs.getInt(3));
				aliens.add(alien);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("exception caught "+e);
		}
		return aliens;
	}
	
	public Alien getAlien(int id) {
		Alien alien = new Alien();
		String sql = "SELECT * FROM alien WHERE id="+id;
		try {
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			while(rs.next()) {
				alien.setId(rs.getInt(1));
				alien.setName(rs.getString(2));
				alien.setPoints(rs.getInt(3));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("exception caught "+e);
		}
		return alien;
	}

	public void createAlien(Alien alien) {
		String sql = "INSERT INTO alien VALUES (?,?,?)";
		try {
			PreparedStatement st = con.prepareStatement(sql);
			st.setInt(1, alien.getId());
			st.setString(2, alien.getName());
			st.setInt(3, alien.getPoints());
			st.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("exception caught "+e);
		}
		
	}

	public void updateAlien(Alien alien) {
		String sql = "UPDATE alien SET name=?, points=? WHERE id=?";
		try {
			PreparedStatement st = con.prepareStatement(sql);
			
			st.setString(1, alien.getName());
			st.setInt(2, alien.getPoints());
			st.setInt(3, alien.getId());
			st.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("exception caught "+e);
		}
		
	}

	public void deleteAlien(int i) {
		
		String sql = "DELETE FROM alien WHERE id=?";
		try {
			PreparedStatement st = con.prepareStatement(sql);
			
			st.setInt(1, i);

	        int rowsDeleted = st.executeUpdate();
	        System.out.println("Rows deleted: " + rowsDeleted);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("exception caught "+e);
		}
	}

	
	

	
}
