package crud_dynamic;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Dynamic_update {

	public static void main(String[] args) {
		
		Connection c=null;
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter the email:");
		String gmail=sc.next();
		
		System.out.print("Enter the phone:");
		long phone=sc.nextLong();
		System.out.print("Enter the Id:");
		int id=sc.nextInt();
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			 c=DriverManager.getConnection("jdbc:mysql://localhost:3306/user_db","root","root");
			
			PreparedStatement ps=c.prepareStatement("update user set gmail=?,phoneNo=? where id=?");
			
			ps.setString(1, gmail);
			ps.setLong(2, phone);
			ps.setInt(3, id);
			
			ps.executeUpdate();
			System.out.println("Date saved successfully");
			
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
