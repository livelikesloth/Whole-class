package test.main;

import test.mypac.MemberDto;

public class MainClass05 {
	public static void main(String[] args) {
		
		MemberDto dto= new MemberDto();
		//setter method test
		dto.setNum(1);
		dto.setName("두부");
		dto.setAddr("Fairfax");
		//getter method test
		int num=dto.getNum();
		String name=dto.getName();
		String addr=dto.getAddr();
		
		//생성자의 인자로 필드에 저장할 값을 모두 전달하면서 객체 생성하기
		MemberDto dto2=new MemberDto(2,"유키", "High Desert");
	}	
}
