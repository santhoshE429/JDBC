package crud_dynamic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Dynamic_insert {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter id:");
		int id=sc.nextInt();
		System.out.print("Enter firstName:");
		String firstName=sc.next();
		System.out.print("Enter lastName:");
		String lastName=sc.next();
		System.out.print("Enter gender:");
		String gender  =sc.next();
		System.out.print("Enter gmail:");
		String gmail=sc.next();
		System.out.print("Enter Password:");
		String password=sc.next();
		System.out.print("Enter phoneNo:");
		int phoneNo=sc.nextInt();
		
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/user_db","root","root");
			
//			PreparedStatement ps=c.prepareStatement("update user set gmail=?,phoneNo=? where id=?");
//			PreparedStatement ps=c.prepareStatement("insert into user values(?,?,?,?,?,?,?)");
			
			PreparedStatement ps=c.prepareStatement("insert into user (id,firstName,lastName,gender,gmail,password,phoneNo)values(?,?,?,?,?,?,?)");
			
//			ps.setString(1, gmail);
//			ps.setInt(2, phoneNo);
//			ps.setInt(3, id);
			
			ps.setInt(1, id);
			ps.setString(2, firstName);
			ps.setString(3, lastName);
			ps.setString(4, gender);
			ps.setString(5, gmail);
			ps.setString(6, password);
			ps.setInt(7, phoneNo);
			
			ps.executeUpdate();
			
			System.out.println("Data Saved suceessfully");
		} catch (ClassNotFoundException |SQLException e) {
			e.printStackTrace();
		}

	}

}
