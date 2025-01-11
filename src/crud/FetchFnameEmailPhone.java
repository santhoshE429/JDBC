package crud;

import java.sql.*;

public class FetchFnameEmailPhone {

	public static void main(String[] args) {
		Connection c=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			 c=DriverManager.getConnection("jdbc:mysql://localhost:3306/user_db","root","root");
			Statement s=c.createStatement();
			ResultSet rs=s.executeQuery("select firstName,gmail,phoneNo from user");
			while(rs.next())
			{
				System.out.println("FIRSTNAME:"+rs.getString(1));
				System.out.println("GAMIL:"+rs.getString(2));
				System.out.println("PHONENO:"+rs.getString("phoneNO"));
				System.out.println("--------------------------------");
			}
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
