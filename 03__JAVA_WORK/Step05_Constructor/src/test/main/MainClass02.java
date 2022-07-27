package test.main;

import test.mypac.Member;

public class MainClass02 {
	public static void main(String[] args) {
		//디버깅 코드로 실행을 해서 m1, m2, m3를 확인해보세요
		Member m1=new Member(1, "두부", "Fairfax");
		Member m2=new Member(2, "유키", "High Desert");
		Member m3=new Member(3, "소주", "Richmond");
		//default 생선자를 이용해서 객체를 생성하면 field 에는 기본값이 들어있다.
		Member m4=new Member();

		
	}
}
