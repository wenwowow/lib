package com.wc.utils;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
public class DBUtil {
	private static String url;
	private static String driverClass;
	private static String username;
	private static String password;
	
	static {
		InputStream in = DBUtil.class.getClassLoader().getResourceAsStream("db.properties");
		Properties prop = new Properties();
		try {
			prop.load(in);
			url = prop.getProperty("url").trim();
			driverClass = prop.getProperty("driverClass").trim();
			username = prop.getProperty("username").trim();
			password = prop.getProperty("password").trim();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public static Connection getConn() {
		Connection conn = null;
		try {
			Class.forName(driverClass);
			conn = DriverManager.getConnection(url, username, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
	
	
	public static void closeResource(Statement stat, Connection conn, ResultSet rs) {
		try {
			if (rs != null)
				rs.close();
			if (stat != null)
				stat.close();
			if (conn != null)
				conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
}
