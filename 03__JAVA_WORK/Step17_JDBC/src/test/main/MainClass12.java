package test.main;

import java.sql.Connection;
import java.sql.PreparedStatement;

import test.util.DBConnect;

public class MainClass12 {
	public static void main(String[] args) {
		//삭제할 회원의 번호라고 가정
		int num =2;
		//회원의 정보를 삭제하고 성공여부를 리턴 받는다.
		boolean isSuccess = delete(2);
		//성공이냐 실패냐에 따라 선택적인 작업을 할 수 있따.
		if (isSuccess) {
			System.out.println(num+" 번 회원을 삭제했습니다.");
		} else {
			System.out.println(num+" 번 회원 삭제 실패");
		}
	}

	// 회원 한명의 정보를 삭제하는 메소드
	public static boolean delete(int num) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		// 변화된(추가, 수정, 삭제) 행의 갯수를 담을 지역변수를 미리 만들어 둔다.
		int updatedRowCount = 0;
		try {
			// DBConnect 객체를 이용해서 Connection 객체의 참조값을 얻어온다.
			conn = new DBConnect().getConn();
			// 실행할 sql 문
			String sql = "DELETE FROM member" + " WHERE num=?";
			// PreparedStatement 객체 얻어내기
			pstmt = conn.prepareStatement(sql);
			// ? 바인딩 할게 있으면 바인딩 한다.
			pstmt.setInt(1, num);
			// 실행 후 메소드가 리턴해주는 변화된 행의 갯수를 지역변수에 담는다.
			updatedRowCount = pstmt.executeUpdate();
			System.out.println("회원정보를 삭제합니다.");
		} catch (Exception e) {
			e.printStackTrace();
		} 
		if(updatedRowCount > 0) {
			//작업 성공의 의미이기 때문에 true를 리턴하고
			return true;
		}else {
			return false;
		}
	}
}
