package practice_8_5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MainClass01 {
	public static void main(String[] args) {
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
		ResultSet rs = null;
		try {
			String sql = "select num,name,addr from friends" + " order by num asc";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				int num = rs.getInt("num");
				String name = rs.getString("name");
				String addr = rs.getString("addr");
				System.out.println(num + " | " + name + " | " + addr);
			}
		} catch (Exception e) {
		}
		System.out.println("main 메소드가 종료됩니다.");
	}
}
