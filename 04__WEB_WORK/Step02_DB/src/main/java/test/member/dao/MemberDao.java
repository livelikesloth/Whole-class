package test.member.dao;
/*
 * Application 전역에서 MemberDao 객체는 오직 하나만 생성되어서 사용되도록 제작
 */

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import test.member.dto.MemberDto;
import test.util.DbcpBean;

public class MemberDao {
	// 자신의 참조값을 저장 할 수 있는 static 필드 선언
	private static MemberDao dao;

	// 외부에서 객체 생성하지 못하게 생성자의 접근지정자를 private로 지정함(외부에서 new MemberDao할 수 없음)
	private MemberDao() {
	}

	// MemberDao 객체의 참조값을 리턴해주는 public static 메소드 만들어 놓기
	public static MemberDao getInstance() {
		// 만일 static 필드가 null이면 (최초로 getInstance()메소드가 호출된 것이라면)
		if (dao == null) {
			// MemberDao 객체를 생성해서 stativ 필드에 저장한다.
			dao = new MemberDao();
		}
		// static 필드에 저장된 MemberDao 객체의 참조값을 리턴해 준다.
		return dao;
	}
	//인자로 전달되는 MemberDto 객체에 담긴 회원의 이름과 주소를 DB에 저장하는 메소드
	public boolean insert(MemberDto dto) {
		return false;
	}

	// 전체 회원의 목록을 리턴하는 메소드
	public List<MemberDto> getList() {
		
		//회원 목록을 담을 객체 생성
		List<MemberDto> list= new ArrayList<MemberDto>();
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			//Connection 객체의 참조값 얻어오기 (Connection Pool 에서 하나 가져오기)
			conn = new DbcpBean().getConn();
			//실행할 sql 문 작성
			String sql = "select num, name, addr"
					+ " from member"
					+ " order by num asc";
//------------------------------------------------------------------------ 위에 sql문
			//sql 문을 전달하면서 PreparedStatement 객체의 참조값 얻어오기
			pstmt = conn.prepareStatement(sql);
			//? 에 값을 바인딩 할게 있으면 한다.
//------------------------------------------------------------------------ 여기 바인딩
			//select 문 수행하고 결과를 ResultSet 으로 받아온다.
			rs = pstmt.executeQuery();
			//반복문 돌면서 ResultSet 의 cursor 를 한칸씩 내린다.
			while (rs.next()) {
//----------------------------------------------- cursor 가 위치한 곳의 칼럼 데이터 추출해서 어딘가에 담기 
			MemberDto dto=new MemberDto();
			//ResultSet 에서 읽어온 정보를 MemberDto 객체의 setter 메소드를 이용해서 담는다.
			dto.setNum(rs.getInt("num"));
			dto.setName(rs.getString("name"));
			dto.setAddr(rs.getString("addr"));
			//회원 한명의 정보를 담고 있는 MemberDto 객체의 참조값을 ArrayList 객체에 누적시키기
			list.add(dto);
			}
		} catch (Exception e) {
			//혹시 예외가 발생한다면 예외정보를 콘솔에 출력해서 에러의 원인 찾기 
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
		//ArrayList 객체의 참조값 리턴하기
		return list;
	}
}
