package product;

import java.sql.*;

public class update {

	public static void main(String[] args) {
try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/product_db","root","root");
			Statement s=c.createStatement();
			s.executeUpdate("update product set price=10000 where id=1");
			System.out.println("date updated suceessfully");
		} catch (ClassNotFoundException  |SQLException e) {
			e.printStackTrace();
		}

	}

}
