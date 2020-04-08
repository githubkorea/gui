package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MemberDAO {
	// 드라이버 클래스 로드
	static { // 1. 드라이버 로드
		try {
			Class.forName("oracle.jdbc.OracleDriver"); // 오라클은 어차피 DB연동 할꺼니까 static으로 먼저 끌어올림 클래스로드으으
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} 
	}
		
	// 2. 커넉션 연결  커넥션연결은 드라이버매니저를 통해 연결한다
	public Connection getConnection() {
		String url="jdbc:oracle:thin:@localhost:1521;orcl";  // 데이터베이스 서버 주소 및 연결 문자열
		String user="javadb";	// 허가받은 사용자 아이디
		String password="12345";	// 비밀번호
		
		Connection con =null;
		
		try {
			DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;  
	}
		
	// 데이터베이스 요청 작업
	
	
}
