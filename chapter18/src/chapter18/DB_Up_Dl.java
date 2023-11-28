package chapter18;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement; //ctrl + shift + o 할때 이걸로 들고올것

public class DB_Up_Dl {

	public static void main(String[] args) {
		Connection conn;
		String url = "jdbc:mysql://localhost:3306/dbstudent?serverTimezone=UTC";
		
		String id = "root";   
		String pw = "1234";  

		//SQL문 실행을 위해 사용하는 클래스 Statement
		Statement stmt = null;
		//SQL문 실행 결과를 얻어오기 위한 클래스 : ResultSet
		ResultSet result = null;
		
		try {
			//1단계. JDBC 드라이버 연결
			Class.forName("com.mysql.cj.jdbc.Driver"); 
			
			//2단계. 데이터베이스 연결
			conn = DriverManager.getConnection(url, id, pw); 
			System.out.println("DB 연결 완료");
			
			//3단계. Statement 생성
			stmt = conn.createStatement();
			
			//4단계. SQL문 전송
			//추가
			//stmt.executeUpdate("insert into student (NAME, Dept, ID) values('박명수','실용음악학과','201294563');"); 
			
			//수정
			//stmt.executeUpdate("update student set name = '홍길순' where ID = '202095067';"); //
			
			//삭제
			stmt.executeUpdate("delete from student where name = '손흥민';");
			//5단계. 결과 받기 (메소드 호출)
			printTable(stmt);
			
			//6단계. 연결 해제
			stmt.close();
			conn.close();
			
		} catch (ClassNotFoundException e) {
			System.out.println("JDBC 드라이버 로드 에러");
		} catch (SQLException e) {
			System.out.println("DB 연결 오류 - 데이터가 이미 존재함.");
		}
	}

	//출력 결과 메서드
	private static void printTable(Statement stmt) throws SQLException {
		//5단계 결과 받기
		ResultSet result = stmt.executeQuery("select * from student");
		
		while(result.next()) {
			System.out.print(result.getString("NAME"));
			System.out.print("\t|\t"+result.getString("ID"));
			System.out.println("\t|\t"+result.getString("Dept"));
			
			// getString() 메소드는 해당 데이터 타입으로 '열'값을 읽어온다.
			// 모든 데이터 타입에 대해 읽어오기 가능
			// 필요시 데이터 타입 변환해야함.
		}
		System.out.println();
		//6단계 연결해제
		result.close();
	}
}

