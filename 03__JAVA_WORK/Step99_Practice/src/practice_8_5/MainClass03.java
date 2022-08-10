package practice_8_5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class MainClass03 {
	public static void main(String[] args) {
		int num = 4;
		String addr = "ShinNonhyun";
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
		try {
			String sql = "update friends" + " set addr=?" + " where num=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, addr);
			pstmt.setInt(2, num);
			pstmt.executeUpdate();
			System.out.println("친구의 정보를 수정했습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("main 메소드가 종료됩니다.");
	}
}
