package test.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import test.dto.MemberDto;
import test.util.DBConnect;

public class MainClass11 {
	public static void main(String[] args) {
		int num = 2;
		// 지역변수 num에 담긴 내용을 메소드의 인자로 전달해서 회원 한명의 ㅈ어보를 얻어낸다.
		MemberDto dto = getData(num);
		if (dto == null) {
			System.out.println(num + "번 회원은 존재하지 않습니다.");
		} else {
			System.out.println(num + "번 회원의 이름은" + dto.getName() + " 이고 주소는 " + dto.getAddr() + " 입니다.");
		}
	}

	// 1하면 1정보 리턴 2하면 2정보 리턴 3 하면 3정보 리턴하려는 기능을 만드려 함
	// 인자로 전달되는 번호에 해당되는 회원 한명의 정보를 리턴하는 메소드
	public static MemberDto getData(int num) {
		// 필요한 객체를 담을 지역 변수를 미리 만든다
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		MemberDto dto = null;
		try {
			conn = new DBConnect().getConn();
			// 실행할 sql 문 구성하기
			String sql = "select name, addr" + " from member" + " where num=?";
			pstmt = conn.prepareStatement(sql);
			// ?에 바인딩 할 내용이 있으면 한다.
			pstmt.setInt(1, num);
			// select 문 수행하고 결과를 ResultSet으로 얻어내기
			rs = pstmt.executeQuery();
			/*
			 * primary key 로 select 를 하게 되면 select 된 row는 최대 1개이므로 cursor를 반복문 사용 하면서 여러번 내릴
			 * 필요가 없다. 즉 rs.next() 한번만 수행되면 된다.
			 */

			if (rs.next()) {
				// 커서가 위치한 곳에 select 된 칼럼 정보를 얻어낸다.
				String name = rs.getString("name");
				String addr = rs.getString("addr");
				// select 된정보를 MemberDto 객체를 생성해서 담는다.
				dto = new MemberDto();
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
		// select 된 row 가 없다면 dto 는 null이다.
		return dto;
	}
}
