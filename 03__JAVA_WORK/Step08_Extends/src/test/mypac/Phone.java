package test.mypac;

public class Phone { // 어떤 클래스도 상속받지 않으면 자동으로 extend Object 된다.
	// 생성자
	public Phone() {
		System.out.println("Phone 생성자 호출됨");
	}
	// 전화거는 메소드
	public void call() {
		System.out.println("전화를 걸어요!");
	}
}
