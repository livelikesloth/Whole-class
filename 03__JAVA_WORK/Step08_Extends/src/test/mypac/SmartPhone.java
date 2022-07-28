package test.mypac;

public class SmartPhone extends HandPhone {
	// 생성자
	public SmartPhone() {
		// 부모생성자 즉 HandPhone 클래스의 생성자를 호출하는 표현식.
		super(); // 부모생성자 중에서 default 생성자를 호출할때는 생략 가능.

		System.out.println("SmartPhone 생성자 호출됨");
	}

	// 인터넷 기능
	public void exploreSafari() {
		System.out.println("스마트폰은 Apple이 최고!");
	}

	// 사진 찍는 메소드 재정의(override)하기
	@Override
	public void takePicture() {
		System.out.println("폰카 화질이 구리면 Leica를 사요!");
	}
}