package practice_8_5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MainClass04 {
	public static void main(String[] args) {
		int num = 1;
		String name = "DUBU";
		String addr = "Beale";
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
			String sql = "update friends" 
					+ " set name=?" 
					+ " , addr=?" 
					+ "	where num=?";

			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			pstmt.setString(2, addr);
			pstmt.setInt(3, num);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
