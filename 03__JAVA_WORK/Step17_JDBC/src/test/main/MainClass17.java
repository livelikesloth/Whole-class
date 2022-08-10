package test.main;

import java.util.ArrayList;
import java.util.List;

import test.dao.MemberDao;
import test.dto.MemberDto;

public class MainClass17 {
	public static void main(String[] args) {
		/*
		 * MemberDao 객체를 이용해서 회원 전체 목록을 얻어와서 
		 * 아래와 같은 형식으로 출력해 보세요
		 * 
		 * 번호 => 1, 이름 => 두부, 주소 => 페어펙스
		 * 번호 => 2, 이름 => 유키, 주소 => 하이데저트
		 */
		MemberDto dto = new MemberDto();
		MemberDao dao = new MemberDao();
		List<MemberDto> list = new MemberDao().getList();
		for (int i = 0; i < list.size(); i++) {
			System.out.println("번호 => "+list.get(i).getNum()+", 이름 => "+list.get(i).getName()+", 주소 =>"+list.get(i).getAddr());
		}		
	}
}
