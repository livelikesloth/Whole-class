package test.mypac;

/*
 * 함수 모양으로 사용 할 인터페이스에 붙이는 어노테이션
 *  - 추상 메소드가 1개인 인터페이스
 *  - 추상 메소드의 갯수가 1개로 강제된다.
 */

@FunctionalInterface
public interface Calc {
	//인자로 숫자 2개를 전달 받아서 어떠한 연산을 한 후 결과를 리턴해주는 추상 메소드
	public double exec(double num1, double num2);
}
