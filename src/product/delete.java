package product;

import java.sql.*;

public class delete {

	public static void main(String[] args) {
		Connection c=null;
try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			c=DriverManager.getConnection("jdbc:mysql://localhost:3306/product_db","root","root");
			Statement s=c.createStatement();
			s.executeUpdate("delete from product where id=1");
			System.out.println("date deleted suceessfully");
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
