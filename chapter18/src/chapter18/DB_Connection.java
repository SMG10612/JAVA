package chapter18;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB_Connection {

	public static void main(String[] args) {
		Connection conn;
		String url = "jdbc:mysql://localhost:3306/dbstudent?serverTimezone=UTC";
		// �����ͺ��̽� URL           localhost �Ǵ� 127.0.0.1 �� ����.
		// connector 5.1.x ���Ĺ������� KSTŸ������ �ν����� ���ϴ� �̽��� �־� serverTimezone �߰�.
		// ���� �ѱ� ���� ������ �ִٸ� useUnicode=true&characterEncoding=UTF8 �߰� ����. 
		
		String id = "root";   // DB�� �α����� ID
		String pw = "1234";   // MYSQL ���� �� �Է��� PASSWORD

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");  // JDBC ����̹� �ε�.
			
			conn = DriverManager.getConnection(url, id, pw);  // �����ͺ��̽� ����.
			// DriverManager �ڹ� ���ø����̼��� JDBC����̹��� ��������ִ� Ŭ����. 
			// getConnection() �޼ҷ� DB�� �����Ͽ� Connection ��ü ��ȯ.
			System.out.println("DB ���� �Ϸ�");
		} catch (ClassNotFoundException e) {
			System.out.println("JDBC ����̹� �ε� ����");
		} catch (SQLException e) {
			System.out.println("DB ���� ����");
		}
	}
}

