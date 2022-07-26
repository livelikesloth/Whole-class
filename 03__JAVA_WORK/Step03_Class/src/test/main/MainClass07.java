package test.main;

import java.util.Random;

public class MainClass07 {
public static void main(String[] args) {
	//Random type 참조값이 담길 수 있는 ran 이라는 이름의 빈 지역변수만들기
	Random ran=null;
	// Random 객체를 생성해서 그 참조값을 ran에 대입하기
	ran=new Random();
	//참조값에 . 찍어서 nextInt( ) 메소드를 호출하고 메소드가 리턴해주는 값을 지역변수 ranNum에 담기.
	int ranNum=ran.nextInt();
	// ranNum 변수에 담긴 값을 콘솔창에 출력해 보기
	System.out.println(ranNum);
	}
}
