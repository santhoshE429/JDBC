package crud_dynamic;

import java.sql.*;
import java.util.Scanner;

public class FetchBySal {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter starting phoneNo");
		long start=sc.nextLong();
		System.out.println("Enter ending phoneNo");
		long end=sc.nextLong();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/user_db","root","root");
			
			PreparedStatement ps=c.prepareStatement("select * from user where phoneNo between ? and ?");
			ps.setLong(1, start);
			ps.setLong(2, end);
			ResultSet res=ps.executeQuery();
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
			} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
