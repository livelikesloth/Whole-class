package test.main;

import test.dao.MemberDao;
import test.dto.MemberDto;

public class MainClass13 {
	public static void main(String[] args) {
		String name="Jajangmyeon";
		String addr="IsacBurger";
		

		/*
		 * 위의 회원 정보를 MemberDao 객체를 이용해서 DB에 저장하고 
		 * 성공이면 "회원 정보를 추가했습니다."
		 * 실패면 "추가 실패"
		 * 를 콘솔창에 출력하는 code를 작성		
		 */	
		
		//추가할 회원의 정보를 MemberDto 객체를 생성해서 담는다.
		MemberDto dto = new MemberDto();
		dto.setName(name);
		dto.setAddr(addr);
		//MemberDao 객체를 생성해서
		MemberDao dao = new MemberDao();
		//insert()메소드를 이용, 회원의 정볼르 추가하고 성공 여부를 리턴 받는다.		
		boolean isSuccess = dao.insert(dto);
		
		if (isSuccess) {
			System.out.println("회원 정보를 추가했습니다.");
		} else {
			System.out.println("추가 실패");
		}
	}	
}
