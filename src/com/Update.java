package com;
import java.sql.*;
public class Update {

	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/user_db","root","root");
			
			Statement s=c.createStatement();
			s.executeUpdate("update user set phoneNo=987 where id=1");
			System.out.println("done ");
		} catch (ClassNotFoundException |SQLException e) {
			e.printStackTrace();
		}

	}

}
