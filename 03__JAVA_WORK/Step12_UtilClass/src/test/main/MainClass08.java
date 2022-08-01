package test.main;

import java.util.ArrayList;
import java.util.List;

import test.mypac.MemberDto;


public class MainClass08 {
	public static void main(String[] args) {
		//1. MemberDto 객체를 담을 수 있는 ArrayLest 객체를 생성해서 참조값을 members라는 지역변수에 담아보세요
		List<MemberDto> members=new ArrayList<MemberDto>();
		//2. 3명의 회원정보를 MemberDto 객체에 각각 담아보세요 (MemberDto 객체가 3개 생성되어야 함)
		MemberDto dto1=new MemberDto();
		dto1.setNum(1);
		dto1.setName("두부");
		dto1.setAddr("Fairfax");
		
		MemberDto dto2=new MemberDto(2, "유키", "High Desert");
		MemberDto dto3=new MemberDto(3, "소주", "Richmond");
	
		//3. 위에서 생성된  MemberDto 객체의 참조값을 ArrayLest 객체에 모두 담아보세요
		members.add(dto1);
		members.add(dto2);
		members.add(dto3);
		/*
		 * ArrayLest 객체에 담긴 내용을 이용해서 회원목록을 아래와 같은 형식으로 반복문 돌면서 출력해보세요
		 * 
		 * 번호 : 1, 이름 : 두부, 주소 : Fairfax
		 */
		for(MemberDto tmp:members) {
			System.out.println("번호 : "+tmp.getNum()+" 이름 : "+tmp.getName()+" 주소 : "+tmp.getAddr());
		}
		
	}
}
