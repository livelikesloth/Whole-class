package test.mypac;

public class Zoo {
	/*
	 * 클래스 안에 정의 할 수 있는게 뭐가 있지요?
	 * 
	 * 생성자, 필드, 메소드, *클래스(innerClass)
	 */

	// 내부 클래스
	public class Sloth {
		public void say() {
			System.out.println("나무늘보처럼 살아야해.");
		}
	}
	// 내부 클래스
	public class Raccoon {
		public void say() {
			System.out.println("나는 손을 사용할줄 알지.");
		}
	}

	public Sloth getSloth() { // 내부 클래스로 객체를 생성해서 리턴해주는 메소드
		return new Sloth();
	}
	public Raccoon getRacoon() {// 내부 클래스로 객체를 생성해서 리턴해주는 메소드
		return new Raccoon();
	}
}
