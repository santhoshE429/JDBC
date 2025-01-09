package crud;

import java.sql.*;


public class Select {

	public static void main(String[] args) {
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/user_db","root","root");
			Statement s=c.createStatement();
			ResultSet res=s.executeQuery("select * from user ");
			while(res.next())
			{	
				
				System.out.println("ID : "+res.getInt("id"));
				System.out.println("FNAME : "+res.getString(2));
				System.out.println("LNAME : "+res.getString(3));
				System.out.println("GENDER : "+res.getString(4));
				System.out.println("GMAIL : "+res.getString(5));
				System.out.println("PASSWORD : "+res.getString(6));
				System.out.println("PHONE No : "+res.getInt("phoneNo"));
				System.out.println("------------------------------");
				
				
			}
			
			res.close();
			s.close();
			c.close();
			
		} catch (ClassNotFoundException  |SQLException e) {
			e.printStackTrace();
		}

	}

}
