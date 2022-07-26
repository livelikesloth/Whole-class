package test.main;

import java.util.Scanner;

public class MainClass08 {
	public static void main(String[] args) {
		//scanner 객체를 생성해서 scan 이라는 지역변수에 참조값을 담기
		Scanner scan=new Scanner(System.in);
		//콘설에 입력한 문자열을 읽어와서 변수에 담기
		String line=scan.nextLine();
		System.out.println("line: "+line);		
	}
}
