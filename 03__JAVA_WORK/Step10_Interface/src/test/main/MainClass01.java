package test.main;

import test.mypac.MyRemote;
import test.mypac.RemoteController;

public class MainClass01 {
	public static void main(String[] args) {

		RemoteController r1 =new MyRemote();
		r1.up();
		r1.down();
		
		/*
		 * 필드나 지역변수에 final 이라는 예약어를 붙이면 변수가 아니고 상수가 된다.
		 * 상수는 값이 변경되지 않는다.
		 * 따라서 아래의 num, name, r2에 다른 값을 다시 대입할 수 없다.
		 * js의 const 
		 */
		
		final int num=10;
		final String name="Dubu";
		final RemoteController r2=new MyRemote();	
		
		
		final double PI=3.141592;
		final String GREET_KOR="안녕하세요!";
		final String GREET_ENG="hello";
		final String GREET_JPN="곤니찌와";
		final String GREET_CHN="니하오";
				
		//익명클래스
		RemoteController r5=new RemoteController() {			
			@Override
			public void up() {
				System.out.println("볼륨을 올린다.");
			}			
			@Override
			public void down() {
				System.out.println("볼륨을 내린다.");
			}
		};
		r5.up();
		r5.down();
	}
}
