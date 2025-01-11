package product;
import java.sql.*;

public class Insert {

	public static void main(String[] args) {
		Connection c=null;
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			c=DriverManager.getConnection("jdbc:mysql://localhost:3306/product_db","root","root");
			Statement s=c.createStatement();
			s.executeUpdate("insert into product value(1,'laptop',20000,'lenovo','black','1',5)");
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
