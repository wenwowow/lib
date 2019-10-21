package Mysql;

import java.sql.ResultSet;
import java.sql.Statement;

public class DBTest {
	public static void main(String[] args) throws Exception
	{
		Statement con=MySqlDAO.getConnection().createStatement();
		//������
		String sql_create="create table student(no int primary key,name char(20))";		
		con.execute(sql_create);
		//��
		String sql_add="insert into student values(1,'jim')";		
		con.execute(sql_add);
		//��ȡ����
		String sql_read="select * from student where no=1";
		ResultSet rs=con.executeQuery(sql_read);//�α�
		while(rs.next()) {
			System.out.print("ѧ�ţ�"+rs.getInt("no"));
			System.out.print("������"+rs.getString(2));
		}
		con.close();
	}
}
