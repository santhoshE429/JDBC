package product;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Dynamic_update {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Id:");
		int id=sc.nextInt();
		
		System.out.print("Enter product price:");
		double price=sc.nextDouble();
		
	try {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/product_db","root","root");
		PreparedStatement ps=c.prepareStatement("update product set price=? where id=?");
		ps.setInt(2, id);
		
		ps.setDouble(1,price);
		
		ps.executeUpdate();
		System.out.println("date updated suceessfully");
	} catch (ClassNotFoundException  |SQLException e) {
		e.printStackTrace();
	}

	}

}
