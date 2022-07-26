package test.main;

import test.mypac.myObject;

public class MainClass01 {
	public static void main(String[] args) {
		//myObject 클래스에 정의된 3개의 메소드를 차례로 호출하는 code를 작성해보세요
		myObject mO=new myObject();
		// return type 이 없는 메소드 호출
		mO.walk();
		// return type  이 int 인 메소드 호출
		int a = mO.getNumber();
		// return type이 String 인 메소드 호출
		String b = mO.getGreeting();
		System.out.println(a+b);
	}
}
