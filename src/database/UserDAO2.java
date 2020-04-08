package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

public class UserDAO2 {
	// DB연동을 위해선 커넥션 부분이 필요해
	
	static {
		//드라이버 클래스 로드
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public Connection getConnection() {
		Connection con = null;
		
		//커넥션 연결
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		
		String user = "javadb";
		String password="12345";
		
		try {
			con = DriverManager.getConnection(url,user,password);
		} catch (SQLException e) {
			e.printStackTrace();
			
		}
		return con;
	}
	// 전체리스트 가져오기
	public Vector<UserVO2> getList(){
		Vector<UserVO2> vecList = new Vector<UserVO2>();
		
		String sql = "select * from userTBL";
		
		try (Connection con = getConnection();
			 PreparedStatement pstmt = con.prepareStatement(sql);
			 ResultSet rs = pstmt.executeQuery()) {
				
			while(rs.next()) {
				UserVO2 vo = new UserVO2();
				vo.setNo(rs.getInt(1));
				vo.setUsername(rs.getString(2));
				vo.setBirthyear(rs.getInt(3));
				vo.setAddr(rs.getString(4));
				vecList.add(vo);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return vecList;
	}
}