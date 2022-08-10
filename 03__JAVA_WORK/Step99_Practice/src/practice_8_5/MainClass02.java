package practice_8_5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MainClass02 {
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
		int num=4;
		String name = "Jazz";
		String addr="Shinrim";
		PreparedStatement pstmt=null;
		String sql="insert into friends"
				+ "(num, name, addr)"
				+ "values(?, ?, ?)";
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			pstmt.setString(2, name);
			pstmt.setString(3, addr);
			pstmt.executeUpdate();
			System.out.println("친구의 정보를 저장했습니다.");
		} catch (SQLException e) {

			e.printStackTrace();
		}

	}
}
