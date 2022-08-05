package test.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import test.dto.MemberDto;
import test.util.DBConnect;

public class MainClass09 {
	public static void main(String[] args) {
		// 수정할 회원의 정보
		int num = 1;
		String name = "Pumba";
		String addr = "Orange County";

		MemberDto dto = new MemberDto();
		dto.setNum(num);
		dto.setName(name);
		dto.setAddr(addr);
		update(dto);

		// 아래의 update() 메소드를 활용해서 회원 정보를 수정할 수 있도록 해 보세요
	}

	public static void update(MemberDto dto) {
		// MemberDto 객체에 담긴 회원정보를 DB에 저장하는 작업을 해보세요(시퀀스 사용하기)
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
	         //오라클 드라이버 로딩
	         Class.forName("oracle.jdbc.driver.OracleDriver");
	         //접속할 DB 의 정보 @아이피주소:port번호:db이름
	         String url="jdbc:oracle:thin:@localhost:1521:xe";
	         //계정 비밀번호를 이용해서 Connection 객체의 참조값 얻어오기
	         conn=DriverManager.getConnection(url, "scott", "tiger");
	         //예외가 발생하지 않고 여기까지 실행순서가 내려오면 접속 성공이다.
	         System.out.println("Oracle DB 접속 성공");
	      } catch (Exception e) {
	         e.printStackTrace();
	      }
		conn=new DBConnect().getConn();
		try {
			String sql="UPDATE member"
					+ " Set name=?"
					+ " , addr=?"
					+ " Where num=?";
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, dto.getName());
			pstmt.setString(2, dto.getAddr());
			pstmt.setInt(3, dto.getNum());
			
			pstmt.executeUpdate();
		} catch (Exception e) {
		}finally {
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
