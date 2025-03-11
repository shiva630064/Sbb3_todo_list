package factory;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBconn {
	static Connection con;
	public static Connection getConn() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sbb3_todo","root","");
		}catch(Exception e) {
			
			e.printStackTrace();
		}
		return con;
	}
}
 