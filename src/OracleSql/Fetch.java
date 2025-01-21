package OracleSql;

import java.sql.*;

public class Fetch {

	public static void main(String[] args) {
		
		Connection c=null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			c=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","SCOTT","TIGER");
			Statement s=c.createStatement();
			s.execute("Select * from emp");
			ResultSet rs=s.getResultSet();
			while(rs.next()) {
				System.out.println("EMPNO :"+rs.getInt(1));
				System.out.println("ENAME :"+rs.getString(2));
				System.out.println("JOB :"+rs.getString(3));
				System.out.println("------------------------");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				if(c!=null)
					c.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
