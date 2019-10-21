package sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Test {
	public static void main(String[] args) {

	    try {
	        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
	    } catch (ClassNotFoundException e) {
	        System.err.println("未找到驱动");
	    }
	    System.out.println("数据库驱动成功");

	    try {
	        String connectDB = "jdbc:sqlserver://localhost\\SQLEXPRESS:1434;DatabaseName=t";
	        String user = "root";
	        // 这里只要注意用户名密码不要写错即可
	        String password = "wadm541520";
	        Connection con = DriverManager.getConnection(connectDB, user,
	                password);
	        // 连接数据库对象
	        System.out.println("连接数据库成功");
	        Statement stmt = con.createStatement();
	        // 创建SQL命令对象

	        // 创建表
	        System.out.println("开始创建表");
	        String query = "create table T(ID NCHAR(4) PRIMARY KEY NOT NULL,NAME NCHAR(10),TEL NCHAR(11))";
	        stmt.executeUpdate(query);// 执行SQL命令对象
	        System.out.println("表创建成功");

	        // 输入数据
	        System.out.println("开始插入数据");
	        String a1 = "INSERT INTO T VALUES('0001','李华','13933209898')";
	        // 插入数据SQL语句
	        String a2 = "INSERT INTO T VALUES('0002','王丽','13698760987')";
	        String a3 = "INSERT INTO T VALUES('0003','张哥','1786308096')";
	        stmt.executeUpdate(a1);// 执行SQL命令对象
	        stmt.executeUpdate(a2);
	        stmt.executeUpdate(a3);
	        System.out.println("插入数据成功");

	        // 读取数据
	        System.out.println("开始读取数据");
	        ResultSet rs = stmt.executeQuery("SELECT * FROM T");// 返回SQL语句查询结果集(集合)
	        // 循环输出每一条记录
	        while (rs.next()) {
	            // 输出每个字段
	            System.out.println(rs.getString("ID") + "\t"
	                    + rs.getString("NAME"));
	        }
	        System.out.println("读取完毕");
	        stmt.executeUpdate("update dbo.T set NAME='刘丽' where ID='0002'"); // 如果后面不跟where条件，则更新所有列的value字段
	        System.out.println("修改数据完毕");
	        rs = stmt.executeQuery("SELECT * FROM T");// 返回SQL语句查询结果集(集合)
	        // 循环输出每一条记录
	        while (rs.next()) {
	            // 输出每个字段
	            System.out.println(rs.getString("ID") + "\t"
	                    + rs.getString("NAME"));
	        }
	        String sql = "delete from T where id='0001'";
	        stmt.executeUpdate(sql);
	        System.out.println("删除数据完毕");
	        rs = stmt.executeQuery("SELECT * FROM T");// 返回SQL语句查询结果集(集合)
	        // 循环输出每一条记录
	        while (rs.next()) {
	            // 输出每个字段
	            System.out.println(rs.getString("ID") + "\t"
	                    + rs.getString("NAME"));
	        }

	        // 关闭连接
	        stmt.close();// 关闭命令对象连接
	        con.close();// 关闭数据库连接
	    } catch (SQLException e) {
	        e.printStackTrace();
	        System.out.print(e.getErrorCode());
	        System.out.println("数据库连接错误");
	        System.exit(0);
	    }

	}
}
