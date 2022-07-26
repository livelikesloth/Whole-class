package test.main;

import java.io.PrintStream;

public class MainClass06 {
public static void main(String[] args) { 
	/*
	 * Systeam 클래스의 out 이라는 static 필드에 담긴 참조값을 
	 * PrintStream type 지역 변수에 담기
	 * 지역변수에 담긴 참조값에 . 찍어서 rpintln( ) 메소드 호출해 콘솔창에 문자열 출력하기
	 */
	PrintStream a=System.out;
	a.println("hi~");
	}	// == System.out.println("hi~");
	
}
