package test.main;

//1. 객체를 생성하는데 필요한 클래스 import
import test.mypac.Calculator;

public class MainClass01 {
	public static void main(String[] args) {

		/*
		 * 만일 프로그래밍의 목적이 '계산'
		 * 
		 * -계산 기능을 수행할 수 있는 객체가 필요하다 -계산기능을 수행할 수 있는 객체를 생성해서 heap 영역에 올려놓고 -참조값을 이용해서
		 * 계산을 해야한다. -다른곳에서 import수입해서 사용해야함
		 */

//2. 객체를 생성한다.
		Calculator cal = new Calculator();
		cal.exec();
		cal.exec();
		cal.exec();

		// Calculator 객체의 brand 필드 참조하기
		String a = cal.brand;
	}
}
