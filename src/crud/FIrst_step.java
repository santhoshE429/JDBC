package crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class FIrst_step {

	public static void main(String[] args) {
		Connection c=null;
		try {
			//1. Load and register the driver-Explicitly
			java.sql.Driver d=new com.mysql.cj.jdbc.Driver();
			DriverManager.registerDriver(d);
		
			
			  
			//2.Establish Connection
			 c=DriverManager.getConnection("jdbc:mysql://localhost:3306/user_db","root", "root");
		
			//3.Create Statement
			
			Statement s=c.createStatement();
			
			//4.ExecuteQuery
			
			//s.executeUpdate("insert into user values(1,'sant','E','male','sant@gmail.com','1223',12334)");
			s.executeUpdate("delete from user where id=1");
			System.out.println("Data Saved.......");
			
		} catch (Exception e) {
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
