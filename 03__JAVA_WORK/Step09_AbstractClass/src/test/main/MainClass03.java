package test.main;

import test.mypac.Zoo;
import test.mypac.Zoo.Raccoon;
import test.mypac.Zoo.Sloth;

public class MainClass03 {
	public static void main(String[] args) {
		// 1. Zoo 객체를 생성해서 참조값을 z라는 지역 변수에 담아보세요
		Zoo z = new Zoo();

		// 2. z 안에 있는 참조값을 이용해서 getSloth() 메소드를 호출해서 리턴되는 값을 m1이라는 지역 변수에 담아 보세요
		Sloth s1 = z.getSloth();

		// 3. m1 안에 있는 참조값을 이용해서 say() 메소드를 호출해 보세요.
		s1.say();

		// zoo 클래스에 있는 getRaccoon() 메소드를 호출해서 리턴되는 값을 r1이라는 지역변수에 담아보세요.
		Raccoon r1 = z.getRacoon();
		// r1 안에 있는 참조값을 이용해서 say() 메소드를 호출해 보세요
		r1.say();
	
		//메소드 안에도 클래스를 정의 할 수 있다. 해당 메소드 안에서만 사용 할 수 있다. 지역 이너클래스 local innerclass
		class Dubu {
			public void say() {
				System.out.println("두부가 보고싶어 ㅠㅠ");
			}
		}
		Dubu d1= new Dubu();
		d1.say();
	}
}