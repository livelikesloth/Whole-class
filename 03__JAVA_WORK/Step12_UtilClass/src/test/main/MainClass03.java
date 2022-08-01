package test.main;

import java.util.Scanner;

public class MainClass03 {
	public static void main(String[] args) {
		//콘솔창으로부터 문자열을 입력 받을 수 있는 Scanner 객체
		Scanner scan = new Scanner(System.in);
		//문자열 1줄 입력 받고
		System.out.print("문자열 입력 : ");
		String line=scan.nextLine();
		//입력 받은 내용 출력하기
		System.out.println(line);
	}
}
