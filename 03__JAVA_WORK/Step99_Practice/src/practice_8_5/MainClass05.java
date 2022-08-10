package practice_8_5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MainClass05 {
	public static void main(String[] args) {
		int num=4;
		Connection conn = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(url, "scott", "tiger");
			System.out.println("Oracle DB 접속 성공");
		} catch (Exception e) {
			e.printStackTrace();
		}
		PreparedStatement pstmt = null;
		
		String sql="delete from friends"
				+ " where num=?";
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			pstmt.executeUpdate();
		} catch (SQLException e) {

			e.printStackTrace();
		}
		System.out.println("main 메소드가 종료 됩니다.");
	}
}
