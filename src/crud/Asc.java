package crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Asc {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/user_db","root","root");
			
			Statement s=c.createStatement();
			ResultSet res=s.executeQuery("select * from user order by  phoneNo asc" );
			
			
		
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
