package test.main;

import java.util.HashMap;
import java.util.Scanner;

public class MainClass09 {
	public static void main(String[] args) {
		HashMap<String, String> dic = new HashMap<>();
		dic.put("house", "집");
		dic.put("phone", " 전화기");
		dic.put("car", "차");
		dic.put("pencil", "연필");
		dic.put("eraser", "지우개");
		
		
		/*
		 * 검색할 단어를 입력하세요 : house
		 * house의 뜻은 집 입니다.
		 * 
		 * 검색할 단어를 입력하세요 : dubu
		 * dubu는 목록에 없습니다.
		 */
		
		
		Scanner scan = new Scanner(System.in);
		System.out.print("검색할 단어를 입력하세요 : ");
		String line=scan.nextLine();
		boolean kc = true;
		if (kc == dic.containsKey(line)){
			System.out.println(line+"의 뜻은 "+dic.get(line) +" 입니다.");
		
		}else {
			System.out.println(line+" 은(는) 목록에 없습니다.");
		}
	
//		선생님
//		Scanner scan = new Scanner(System.in);
//		System.out.print("검색할 단어를 입력하세요 : ");
//		String word=scan.nextLine();
//		String mean=dic.get(word);
//		
//		if(mean ==null) {
//			System.out.println(word+" 는 목록에 없습니다.");
//		}else {
//			System.out.println(word+" 의 뜻은 " + mean+" 입니다.");
//		}
		
	
	}
}
