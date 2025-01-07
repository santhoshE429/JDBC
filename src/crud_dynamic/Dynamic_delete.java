package crud_dynamic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Dynamic_delete {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the id");
		int id=sc.nextInt();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/user_db","root","root");
			PreparedStatement ps=c.prepareStatement("delete from user where id=?");
			ps.setInt(1, id);
			ps.executeUpdate();
			System.out.println("deleted id= "+id+ " suceessfully");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
