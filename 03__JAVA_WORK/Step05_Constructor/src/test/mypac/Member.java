package test.mypac;

public class Member {
	public int num;
	public String name;
	public String addr;

	// 아무 값도 전달 받지 않는 기본 생성자
	public Member() {
		System.out.println("기본 생성자가 호출되었습니다.");
	}

	// 필드에 저장할 값을 전달 받는 생성자(return type이 없고 class명이랑 똑같음 ->생성자)
	public Member(int num, String name, String addr) {
		this.num = num;
		this.name = name;
		this.addr = addr;
	}
}
