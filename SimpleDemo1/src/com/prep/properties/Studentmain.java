package com.prep.properties;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.TreeSet;

public class Studentmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://localhost:3306/dxc1";
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
			
			
			pstmt = conn.prepareStatement("SELECT * FROM student");
			rs = pstmt.executeQuery();
			//TreeSet<Student> stud = new TreeSet<>(); Note: if w use tree set in BEAN class(student) we need to implement comparable interface and compare the ids as tree set dont allow duplicates and gives sorted order
			ArrayList<Student> stud = new ArrayList<>();
			while(rs.next()) {
				int sid = rs.getInt("id");
				String sname = rs.getString("name");
				Date sdob = rs.getDate("dob");
				String semail = rs.getString("email");
				String smobile = rs.getString("mobile");
				//System.out.println("USername:" + uname +"Password:"+pass);
				
				Student student = new Student(sid, sname, sdob, semail, smobile);
				stud.add(student);
				
			}System.out.println(stud);
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if (rs != null) rs.close();
	            if (pstmt != null) pstmt.close();
	            if (conn != null) conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		
	

	}

}
