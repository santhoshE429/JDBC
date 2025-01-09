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
			ResultSet rs=s.executeQuery();
		
			
			while(rs.next())
			{
				int id1=rs.getInt("id");
				String fname=rs.getString("firstName");
				String lname=rs.getString("lastName");
				String gender=rs.getString("gender");
				String gmail=rs.getString("gmail");
				String pwd=rs.getString("password");
				int phoneNo=rs.getInt("phoneNo");
				System.out.println("id :"+id1+"\nfirstName :"+fname+"\nLastName :"+lname+"\ngender :"+gender+"\ngamil :"+gmail+"\npassword :"+pwd+"\nphoneNO :"+phoneNo);
			}
			
		} catch (ClassNotFoundException |SQLException e) {
			e.printStackTrace();
		}

	}

}
