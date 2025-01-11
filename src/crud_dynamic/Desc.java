package crud_dynamic;

import java.sql.*;
import java.util.Scanner;

public class Desc {

	public static void main(String[] args) {
		
		Connection c=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			 c=DriverManager.getConnection("jdbc:mysql://localhost:3306/user_db","root","root");
			
			Statement s=c.createStatement();
			ResultSet res=s.executeQuery("select * from user order by  phoneNo desc" );
			
			
		
			while(res.next()) {
				System.out.println("ID : "+res.getInt("id"));
				System.out.println("FNAME : "+res.getString(2));
				System.out.println("LNAME : "+res.getString(3));
				System.out.println("GENDER : "+res.getString(4));
				System.out.println("GMAIL : "+res.getString(5));
				System.out.println("PASSWORD : "+res.getString(6));
				System.out.println("PHONE No : "+res.getInt("phoneNo"));
				System.out.println("------------------------------");
			}
			
			} catch(SQLException | ClassNotFoundException e) 
			{
			e.printStackTrace();
			}
			finally
			{
			try 
			{
				if(c!=null)
					c.close();
			} catch (SQLException e) 
			{
				e.printStackTrace();
			}
		}
		
	}

}
