package Mysql;

import java.sql.Connection;
import java.sql.DriverManager;

public class MySqlDAO {
	public static Connection getConnection() throws Exception{
		String driverName="com.mysql.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/test";
		String userName="root";
		String password="wadm541520";
		Class.forName(driverName);
		Connection con=DriverManager.getConnection(url, userName, password);
		return con;
	}
}
