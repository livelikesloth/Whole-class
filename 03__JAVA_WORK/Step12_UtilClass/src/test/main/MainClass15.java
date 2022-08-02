package test.main;

import java.util.Random;

public class MainClass15 {
	public static void main(String[] args) {
		// Random 한숫자를 얻어낼 수 있는 Random 객체
		Random ran=new Random();
		//int 범위 내에서 랜덤한 정수 얻어내기
		int a = ran.nextInt();
		// 정해진 범위 내에서 랜덤한 정수 얻어내기 0~9
		int b=ran.nextInt(10);
		//0~19
		int c=ran.nextInt(20);
		//1~15사이의 랜덤한 정수
		int d=ran.nextInt(15)+1;
		
	}
}
