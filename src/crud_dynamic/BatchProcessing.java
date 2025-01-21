package crud_dynamic;

import java.sql.*;
import java.util.Scanner;

public class BatchProcessing {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Count:");
		int count=sc.nextInt();
		Connection c=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			c=DriverManager.getConnection("jdbc:mysql://localhost:3306/user_db","root","root");

			PreparedStatement ps=c.prepareStatement("insert into user (id,firstName,lastName,gender,gmail,password,phoneNo)values(?,?,?,?,?,?,?)");
			for(int i=1;i<=count;i++)
			{
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
				long phoneNo=sc.nextInt();
				System.out.println("------------------------");
				ps.setInt(1, id);
				ps.setString(2, firstName);
				ps.setString(3, lastName);
				ps.setString(4, gender);
				ps.setString(5, gmail);
				ps.setString(6, password);
				ps.setLong(7, phoneNo);
				
				ps.addBatch();
			}
			
			
			
			ps.executeBatch();
			
			System.out.println("Data Saved suceessfully");
		} catch (ClassNotFoundException |SQLException e) {
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
