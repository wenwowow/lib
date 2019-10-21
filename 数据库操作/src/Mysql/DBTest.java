package Mysql;

import java.sql.ResultSet;
import java.sql.Statement;

public class DBTest {
	public static void main(String[] args) throws Exception
	{
		Statement con=MySqlDAO.getConnection().createStatement();
		//创建表
		String sql_create="create table student(no int primary key,name char(20))";		
		con.execute(sql_create);
		//增
		String sql_add="insert into student values(1,'jim')";		
		con.execute(sql_add);
		//读取数据
		String sql_read="select * from student where no=1";
		ResultSet rs=con.executeQuery(sql_read);//游标
		while(rs.next()) {
			System.out.print("学号："+rs.getInt("no"));
			System.out.print("姓名："+rs.getString(2));
		}
		con.close();
	}
}
