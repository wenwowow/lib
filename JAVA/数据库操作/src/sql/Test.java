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
	        System.err.println("δ�ҵ�����");
	    }
	    System.out.println("���ݿ������ɹ�");

	    try {
	        String connectDB = "jdbc:sqlserver://localhost\\SQLEXPRESS:1434;DatabaseName=t";
	        String user = "root";
	        // ����ֻҪע���û������벻Ҫд����
	        String password = "wadm541520";
	        Connection con = DriverManager.getConnection(connectDB, user,
	                password);
	        // �������ݿ����
	        System.out.println("�������ݿ�ɹ�");
	        Statement stmt = con.createStatement();
	        // ����SQL�������

	        // ������
	        System.out.println("��ʼ������");
	        String query = "create table T(ID NCHAR(4) PRIMARY KEY NOT NULL,NAME NCHAR(10),TEL NCHAR(11))";
	        stmt.executeUpdate(query);// ִ��SQL�������
	        System.out.println("�����ɹ�");

	        // ��������
	        System.out.println("��ʼ��������");
	        String a1 = "INSERT INTO T VALUES('0001','�','13933209898')";
	        // ��������SQL���
	        String a2 = "INSERT INTO T VALUES('0002','����','13698760987')";
	        String a3 = "INSERT INTO T VALUES('0003','�Ÿ�','1786308096')";
	        stmt.executeUpdate(a1);// ִ��SQL�������
	        stmt.executeUpdate(a2);
	        stmt.executeUpdate(a3);
	        System.out.println("�������ݳɹ�");

	        // ��ȡ����
	        System.out.println("��ʼ��ȡ����");
	        ResultSet rs = stmt.executeQuery("SELECT * FROM T");// ����SQL����ѯ�����(����)
	        // ѭ�����ÿһ����¼
	        while (rs.next()) {
	            // ���ÿ���ֶ�
	            System.out.println(rs.getString("ID") + "\t"
	                    + rs.getString("NAME"));
	        }
	        System.out.println("��ȡ���");
	        stmt.executeUpdate("update dbo.T set NAME='����' where ID='0002'"); // ������治��where����������������е�value�ֶ�
	        System.out.println("�޸��������");
	        rs = stmt.executeQuery("SELECT * FROM T");// ����SQL����ѯ�����(����)
	        // ѭ�����ÿһ����¼
	        while (rs.next()) {
	            // ���ÿ���ֶ�
	            System.out.println(rs.getString("ID") + "\t"
	                    + rs.getString("NAME"));
	        }
	        String sql = "delete from T where id='0001'";
	        stmt.executeUpdate(sql);
	        System.out.println("ɾ���������");
	        rs = stmt.executeQuery("SELECT * FROM T");// ����SQL����ѯ�����(����)
	        // ѭ�����ÿһ����¼
	        while (rs.next()) {
	            // ���ÿ���ֶ�
	            System.out.println(rs.getString("ID") + "\t"
	                    + rs.getString("NAME"));
	        }

	        // �ر�����
	        stmt.close();// �ر������������
	        con.close();// �ر����ݿ�����
	    } catch (SQLException e) {
	        e.printStackTrace();
	        System.out.print(e.getErrorCode());
	        System.out.println("���ݿ����Ӵ���");
	        System.exit(0);
	    }

	}
}
