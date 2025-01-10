package crud_dynamic;

import java.sql.*;
import java.util.Scanner;

public class Dynamic_select {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter id");
		int id=sc.nextInt();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/user_db","root","root");
			PreparedStatement s=c.prepareStatement("select * from user where id=?");
			s.setInt(1, id);
			ResultSet res=s.executeQuery();
		
			
			if(res.next())
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
			else
			{
				System.out.println("Id is not found");
			}
			
		} catch (ClassNotFoundException |SQLException e) {
			e.printStackTrace();
		}

	}

}
