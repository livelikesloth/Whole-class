package test.main;

import java.util.ArrayList;
import java.util.Scanner;

public class MainClass04 {
	public static void main(String[] args) {
		/*
		 * Scanner 객체를 이용해서 반복문 돌면서 친구 이름을 3번 입력 받아서
		 * 입력받은 이름을 ArrayList 객체에 순서대로 저장하는 프로그래밍을 해보세요
		 */
		ArrayList<String> friends = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {			
			System.out.print("친구 등록 : ");
			String line=scan.nextLine();			
			friends.add(line);
		}
		//저장된 내용 출력하기
		for(String tmp:friends) {// 확장for문
			System.out.println(tmp);
		}
		
	}
}
