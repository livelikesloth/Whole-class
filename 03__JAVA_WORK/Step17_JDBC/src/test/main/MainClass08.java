package test.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.HashMap;
import java.util.Map;

import test.util.DBConnect;

public class MainClass08 {
	public static void main(String[] args) {
		String name = "Timon";
		String addr = "High Desert";
		// 추가 할 회원 정보를 Map객체에 담고
		Map<String, String> map = new HashMap<>();
		map.put("name", name);
		map.put("addr", addr);
		// insert 메소드에 전달해서 DB에 저장되는 기능을 완성해 보세요
		insert(map);
	}

	// 인자로 전달 받은 Map 객체에 있는 회원 정보를 DB에 저장하는 메소드
	public static void insert(Map<String, String> map) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			// DBConnect 객체를 이용해서 Connection 객체의 참조값을 얻어온다.
			conn = new DBConnect().getConn();
			// 실행할 sql 문
			String sql = "INSERT INTO member" 
					+ " (num, name, addr)" 
					+ " VALUES(member_seq.NEXTVAL, ?, ?)";
			// PreparedStatement 객체 얻어내기
			pstmt = conn.prepareStatement(sql);
			// ? 바인딩 할게 있으면 바인딩 한다.
			pstmt.setString(1, map.get("name"));
			pstmt.setString(2, map.get("addr"));
			// 실행
			pstmt.executeUpdate();
			System.out.println("회원정보를 저장했습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
			}
		}

	}
}
