package test.main;

import java.util.ArrayList;
import java.util.Iterator;

public class MainClass02 {
	public static void main(String[] args) {
		/*
		 * ArrayList 객체에
		 * 친구 이름 5개를 담고
		 * 반복분 돌면서 친구 이름을 다음과 같은 형식으로 출력해 보세요
		 * 
		 * 0번째 친구 : ㅇㅇㅇ
		 * 1번째 친구 : ㅁㅁㅁ
		 * 2번째 친구 : ㅈㅈㅈ
		 * ...
		 */
		ArrayList<String> names = new ArrayList<>();
		names.add("두부");
		names.add("유키");
		names.add("소주");
		names.add("티몬");
		names.add("품바");
		
			
		for (int i = 0; i < names.size(); i++) {
			String friends = names.get(i);	
			System.out.println(i+"번째 친구 : "+friends);
		}
	}
}
