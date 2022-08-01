package test.main;

import java.util.HashSet;
import java.util.Set;

public class MainClass11 {
	public static void main(String[] args) {
		/*
		 * HashSet 은 Set 인터페이스를 구현한 클래스이다.
		 * 
		 *  - 순서가 없다.
		 *  - key 값도 없다.
		 *  - 중복을 허용하지 않는다.
		 *  - 어떤 data를 묶을(집합) 으로 관리하고자 할 때 사용한다.
		 */
		
		//정수값을 저장할 수 있는 HashSet 객체
		HashSet<Integer> set1 = new HashSet<>();
		set1.add(10);
		set1.add(20);
		set1.add(20);
		set1.add(30);
		set1.add(30);
			
		//문자열을 저장 할 수 있는 HashSet 객체
		Set<String> set2=new HashSet<>();
		set2.add("두부");
		set2.add("유키");
		set2.add("소주");
		set2.add("티몬");
		set2.add("품바");
		
			
			
			
	}
}
