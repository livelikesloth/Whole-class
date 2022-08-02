package test.main;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MainClass14 {
	public static void main(String[] args) {
		//HashSet 객체를 생성해서 참조값을 Set 인터페이스 type으로 담기
		Set<String> names = new HashSet<>();
		names.add("두부");
		names.add("유키");
		names.add("소주");
		names.add("재즈");
		names.add("딜리");
		
		
		// 반복자(Iterator) 객체 얻어내기 (저장된 item을 일렬로 세웠다고 생각하면됨)
		Iterator<String> it = names.iterator();
		//cursor 다음에 item이 있는 동안에만 반복문
		while(it.hasNext()) {
			//cursor 를 다음칸으로 이동해서 커서가 위차한 곳의 item을 읽어오기
			String item =it.next();
			System.out.println(item);
		}
		//특정 item(데이터, 참조값) 존재여부 알아내기
		 boolean isContain=names.contains("두부");
		 //저장된 item의 갯수
		 int size=names.size();
		 //특정 item 삭제
		 names.remove("재즈");
		 //모든 아이템 삭제
		 names.clear();
		 }
}
