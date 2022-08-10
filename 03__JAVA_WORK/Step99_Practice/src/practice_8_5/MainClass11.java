package practice_8_5;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import test.dto.FriendsDto;
import test.util.DBConnect;

public class MainClass11 {
	public static void main(String[] args) {
		int num = 2;

		FriendsDto dto = getData(num);
		if (dto == null) {
			System.out.println(num + "번 회원은 존재하지 않습니다.");
		} else {
			System.out.println(num + "번 회원의 이름은" + dto.getName() + " 이고 주소는 " + dto.getAddr() + " 입니다.");
		}
	}

	public static FriendsDto getData(int num) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		FriendsDto dto = null;
		try {
			conn = new DBConnect().getConn();
			String sql = "select name, addr" 
					+ " from member" 
					+ " where num=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			rs = pstmt.executeQuery();

			if (rs.next()) {
				String name = rs.getString("name");
				String addr = rs.getString("addr");
				dto = new FriendsDto();
				dto.setNum(num);
				dto.setName(name);
				dto.setAddr(addr);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					pstmt.close();
			} catch (Exception e) {
			}
		}
		return dto;
	}
}
