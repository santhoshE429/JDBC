package crud;

import java.sql.*;

public class Delete {

	public static void main(String[] args) {
		Connection c=null;
		
		try {
			//1.load and register driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//2.establish Connection
			c=DriverManager.getConnection("jdbc:mysql://localhost:3306/user_db","root","root");
			
			//3.create statement
			
			Statement s=c.createStatement();
			//4.ExecuteUpdate
			
			s.executeUpdate("delete from user where id=1" );
			System.out.println("Data deleted successfully");

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
