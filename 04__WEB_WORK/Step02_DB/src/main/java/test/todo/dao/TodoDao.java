package test.todo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import test.todo.dto.TodoDto;
import test.util.DbcpBean;

public class TodoDao {
	//자신의 참조값을 저장할 static 필드 선언
	private static TodoDao dao;
	//외부에서 객체 생성하지 못하게 만듦 --같은이름으로 못만들게 하려는거?
	private TodoDao() {}
	//TodoDao 객체의 참조값을 리턴해주는 public static 메소드 만들기
	public static TodoDao getInstance() {
		if(dao==null){//만일 static 필드가 null 이면 (최초로 이 메소드가 호출 된것이라면)
			dao=new TodoDao(); //TodoDao 객체를 생성해서 static 필드에 저장한다.
		}
		return dao; //static 필드에 저장된 TodoDao 객체의 참조값을 리턴해 준다.
	}
	//전체 회원 목록을 리턴하는 메소드
	public List<TodoDto> getList(){
		//회원 목록을 담을 객체 생성
		List<TodoDto> list = new ArrayList<>();

		//로컬변수 생성 리셋
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			// Connection 객체의 참조값 얻어오기 (Connection Pool 에서 하나 가져오기)
			conn = new DbcpBean().getConn();
			// 실행할 sql 문 작성
			String sql = "select num, name, regdate"
					+ " from todo"
					+ "order by num asc";// --------------------------------------------------------- 여기 sql문
			// sql 문을 전달하면서 PreparedStatement 객체의 참조값 얻어오기
			pstmt = conn.prepareStatement(sql);
			// ? 에 값을 바인딩 할게 있으면 한다.
			// --------------------------------------------------------------------------- 여기 바인딩
			// select 문 수행하고 결과를 ResultSet 으로 받아온다.
			rs = pstmt.executeQuery();
			// 반복문 돌면서 ResultSet 의 cursor 를 한칸씩 내린다.
			while (rs.next()) {
			// -------------------------------------- cursor 가 위치한 곳의 칼럼 데이터 추출해서 어딘가에 담기
			//TodoDto 를 생성해줍니다.
			TodoDto dto = new TodoDto();
			//ResultSet에서 읽어온 정보를 TodoDto 객체의 Setter 메소드를 이용해 담는다.
			dto.setNum(rs.getInt("num"));
			dto.setName(rs.getString("name"));
			dto.setDate(rs.getString("regdate"));
			//한가지의 할일을 담고 있는 TodoDto객체의 참조값을 ArrayList에 누적시키기
			list.add(dto);
			}
		} catch (Exception e) {
			// 혹시 예외가 발생한다면 예외정보를 콘솔에 출력해서 에러의 원인 찾기
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
			}
		}
		return list;
	}
}






















