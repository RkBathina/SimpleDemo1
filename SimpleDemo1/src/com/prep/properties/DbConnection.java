package com.prep.properties;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class DbConnection {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/airlines";
		String username = "root";
		String password = "root";
		
		PreparedStatement pstmt = null;
		Connection conn =null; 
		ResultSet rs = null;
		
		
		//Regoster JDBC driver
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//open connection
			conn = DriverManager.getConnection(url, username, password);
			System.out.println("Connect to database");
			
			
			pstmt = conn.prepareStatement("SELECT * FROM admin");
			rs = pstmt.executeQuery();
			ArrayList<String> str = new ArrayList<>();
			while(rs.next()) {
				String uname = rs.getString("username");
				String pass = rs.getString("password");
				System.out.println("USername:" + uname +"Password:"+pass);
				
				str.add(uname);
				str.add(pass);
			}System.out.println(str);
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if(conn != null)conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		
	}

}
