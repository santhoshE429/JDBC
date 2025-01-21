package crud;

import java.sql.*;

public class Execute {

	public static void main(String[] args) {
		Connection c=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			c=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_db","root","root");
			Statement s=c.createStatement();
//			s.execute("create table employee (id int,name varchar(20))");
//			s.execute("insert into employee values(2,'jp')");
			
			
			// Fetching the data
			s.execute("select * from employee");	
			ResultSet rs=s.getResultSet();
			while(rs.next()) {
				System.out.println("id :"+rs.getInt(1));
				System.out.println("id :"+rs.getString(2));
				System.out.println("---------------------------------");
			}
			System.out.println("Table created..");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
