package test.main;

import test.dao.MemberDao;
import test.dto.MemberDto;

public class MainClass14 {
	public static void main(String[] args) {
		int num=3;
		String name="ramyeon";
		String addr="jip";
		
		/*
		 * 위으 정보는 수정할 회원의 정보이다.
		 * 
		 * MemberDao 객체를 이용해서 회운의 정보를 수정해 보세요
		 */
		
		//수정할 회원의 정보를 MemberDto 객체에 담고
		MemberDto dto = new MemberDto(num, name, addr);
		//MemberDao 객체를 이용해서 수정한다.
		MemberDao dao = new MemberDao();
		boolean isSuccess = dao.update(dto);
		
		if(isSuccess) {
			System.out.println("수정 성공");
		}else {
			System.out.println("수정 실패");
		}
	}
}
