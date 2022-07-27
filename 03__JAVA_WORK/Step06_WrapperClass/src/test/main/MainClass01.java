package test.main;
/*
 * [기본 data type 의 참조 data type]
 * 
 * byte 	: Byte
 * short 	: Short
 * int 		: Integer
 * long 	: Long
 * 
 * float 	: Float
 * double 	: Double
 * 
 * char 	: Character
 * boolean 	: Boolean
 * 
 * 때로는 기본데이터 type 츼 챀조 데이터 type 이 필요할 때가 있다.
 * 기본 데이터 type 을 객체에 포장(boxing) 하는 형태
 * boxing 과 unboxing 은 자동으로 되기 때문에 프로그래머가 신경을 쓸 필요는 없다.
 */

public class MainClass01 {
	public static void main(String[] args) {
		System.out.println("main 메소드가 시작 되었습니다.");
		// 기본 data type
		int num1 = 10;
		// 참조 data type
		Integer num2 = 10;

		// 참조 데이터 type 이지만 기본 데이터 type 처럼 사용할 수 있다.
		int result1 = num2 + 1;
		int result2 = num1 + num2;
		Integer result3 = num1 + num2;
		
		//문자열 숫자를 숫자로 바꾸기.
		String strNum="1872";
		//result4는 1872
		int result4=Integer.parseInt(strNum);

		
	}
}
