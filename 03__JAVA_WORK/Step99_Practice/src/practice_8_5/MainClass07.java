package practice_8_5;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import test.dto.FriendsDto;
import test.util.DBConnect;

public class MainClass07 {
	public static void main(String[] args) {
		String name = "Jazz";
		String addr = "Shinrim";
		FriendsDto dto = new FriendsDto();
		dto.setName(name);
		dto.setAddr(addr);
		insert(dto);
	}

	private static void insert(FriendsDto dto) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			conn = new DBConnect().getConn();
			String sql = "insert into friends" + "(num, name, addr)" + "values(friends_seq.nextval, ?, ?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getName());
			pstmt.setString(2, dto.getAddr());
			pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			try {
				if(pstmt !=null)pstmt.close();
				if(conn !=null)conn.close();
			} catch (SQLException e) {
			}
		}

	}
}
