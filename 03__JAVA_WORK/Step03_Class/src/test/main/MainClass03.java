package test.main;

import test.mypac.Member;

public class MainClass03 {
	public static void main(String[] args) {
		System.out.println("main method가 시작되었습니다.");
		//Member 객체를 생성해서 그 참조값을 mem1 이라는 지역변수에 담아보세요.(1줄)
 		Member mem1=new Member();
		mem1.cNumber=1;
		mem1.cName="두부";
		mem1.cAddr="페어펙스";
		
		
		// Member 객체를 생성해서 그 참조값을 mem2 이라는 지역변수에 담고 유키의 정보도 담아보세요
		Member mem2=new Member();
		mem2.cNumber=2;
		mem2.cName="유키";
		mem2.cAddr="하이데저트";
		
		//mem1, mem2 에 들어있는 참조값을 이용해서 showInfo() 메소드 호출하기
 		mem1.showInfo();
		mem2.showInfo();
	}			
}
