package test.main;

import java.util.ArrayList;
import java.util.List;

import test.mypac.Member;

public class MainClass07 {
	public static void main(String[] args) {
		// 1. Member 객체를 담을 수 있는 ArrayList 객체를 생성해서 참조값을 members라는 지역변수에 담아 보세요
		List<Member> members = new ArrayList<Member>();
		// 2. 3명의 회원정보를 Member 객체에 각각 담아 보세요. (Member 객체가 3개 생성되어야 함)
		Member memb0 = new Member(1, "두부", "Fairfax");
		Member memb1 = new Member(2, "유키", "High Desert");		
		
		//empty constructor 사용방법
		Member memb2= new Member();
		memb2.num=1;
		memb2.name="소주";
		memb2.addr="Richmond";

		// 3. 위에서 생성된 Member 객체의 참조값을 members ArrayList 객체에 모두 담아 보세요.
		members.add(memb0);
		members.add(memb1);
		members.add(memb2);

		/*
		 * 4. members ArrayList 객체에 담긴 내용을 이용해서 회원목록을 아래와 같은 형식으로 반복문 돌면서 출력해 보세요
		 * 
		 * 번호 : 1, 이름 : 두부, 주소 : 페어펙스 ...
		 */
		for (Member tmp : members) {
			System.out.println("번호 : " + tmp.num + ", 이름 : " + tmp.name + ", 주소 : " + tmp.addr);
		}
	}
}
