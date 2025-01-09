package crud;

import java.sql.*;

public class FetchAll {

	public static void main(String[] args) {
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/user_db","root","root");
			Statement s=c.createStatement();
			ResultSet rs=s.executeQuery("select * from user");
			
			System.out.println(rs.next());
			System.out.println(rs.next());
			System.out.println(rs.next());
			System.out.println(rs.next());
			System.out.println(rs.next());
			System.out.println(rs.next());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
