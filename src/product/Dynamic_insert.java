package product;

import java.sql.*;
import java.util.Scanner;

public class Dynamic_insert {

	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			Connection c=null;
			System.out.print("Enter Id:");
			int id=sc.nextInt();
			System.out.print("Enter product Name:");
			String name=sc.next();
			System.out.print("Enter product price:");
			double price=sc.nextDouble();
			System.out.print("Enter product brand:");
			String brand=sc.next();
			System.out.print("Enter product color:");
			String color=sc.next();
			System.out.print("Enter product quantity:");
			int quantity=sc.nextInt();
			System.out.print("Enter product rating:");
			int rating=sc.nextInt();
		try {
	
			Class.forName("com.mysql.cj.jdbc.Driver");
			 c=DriverManager.getConnection("jdbc:mysql://localhost:3306/product_db","root","root");
			PreparedStatement ps=c.prepareStatement("insert into product values(?,?,?,?,?,?,?)");
			ps.setInt(1, id);
			ps.setString(2, name);
			ps.setDouble(3,price);
			ps.setString(4, brand);
			ps.setString(5, color);
			ps.setInt(6, quantity);
			ps.setInt(7, rating);
			
			ps.executeUpdate();
			System.out.println("date inserted suceessfully");
		} catch (ClassNotFoundException  |SQLException e) {
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
