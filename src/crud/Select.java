package crud;

import java.sql.*;


public class Select {

	public static void main(String[] args) {
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/user_db","root","root");
			Statement s=c.createStatement();
			ResultSet res=s.executeQuery("select id,phoneNo from user ");
			while(res.next())
			{	
				int id=res.getInt("id");
				
				int phoneNo=res.getInt("phoneNo");
				System.out.println("Phone No : "+id+ " Phone No : "+phoneNo);
			}
			
			res.close();
			s.close();
			c.close();
			
		} catch (ClassNotFoundException  |SQLException e) {
			e.printStackTrace();
		}

	}

}
