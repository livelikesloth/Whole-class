package test.mypac;

/*
 *  클래스를 만들어서 우리에게 사용하도록 제공해주는 개발자(유틸리티나 프레임워크를 공급해주는)가 있고 가정
 *  
 *  그 개발자는 특정 메소드를 우리의 상황에 맞게 구현하도록 미완성인 메소드를 제공 할 때도 있다.
 *  
 *  미완성인 메소드를 추상메소드(abstract method)고 하며 추상메소드를 하나이상 가지고 있는 클래스를 
 *  추상클래스 (abstract class)라고 한다.
 *  
 *  추상 메소드와 추상 클래스를 만들기 위해서는 abstract 예약어가 필요하다
 *  
 */

public abstract class Weapon {
	
	//무기 작동을 준비하는 메소드
	public void prepare() {
		System.out.println("무기 작동을 준비합니다.");
	}
	
	//공격하는 메소드
	public abstract void attack();
}