package crud;
import java.sql.*;
public class Insert {

	public static void main(String[] args) {
		Connection c=null;
		
		try {
			//1. Load and register the driver -implicitly
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//2.Establish Connection
			
			 c=DriverManager.getConnection("jdbc:mysql://localhost:3306/user_db","root", "root");
			
			
			//3.Create Statement
			
			Statement s=c.createStatement();
			
			//4.ExecuteQuery
			
			s.executeUpdate("insert into user values(1,'sant','E','male','sant@gmail.com','1223',12334)");
//			s.executeUpdate("insert into user values(3,'santhosh','E','male','santh@gmail.com','345',034)");
//			s.executeUpdate("delete from user where id=1");
			System.out.println("Data Saved.......");
			
			
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
