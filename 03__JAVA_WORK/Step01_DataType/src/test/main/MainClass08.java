package test.main;
/*
 * java 에서 기본 데이터 type 8개를 제외한 나머지는 모두 참조 데이터 type이다.
 * 
 * 참조 데이터 type 객체는 heap영역(사물함 영역) 에 만들어 진다.
 * 
 * 모든 객체는 저장소(field) 와 기능(method) 로 구성되어 있을 수 있다.
 * 어떤 저장소와 어떤 기능을 가지게 될 지는 해당 type 객체가 어떻게 설계되었냐에 따라 다르다.
 * 
 * 참조값에 . 을 찍으면 저장소를 참조하거나, 기능을 사용할 수 있다.
 * 참조값에 . 을 찍으면 field를 참조하거나 method를 호출 할 수 있다.
 * 메소드 호출은 javascript 에서 함수 호출과 유사하다. 
 */

public class MainClass08 {
	public static void main(String[] args) {
		String str = "abcde12345";
		int result1 = str.length();
		char result2 = str.charAt(5);
		/*
		 * String 객체의 메소드를 활용해서 str 변수 안에 있는 문자를 모두 대문자(UpperCase)로 변환해서 str2 라는 이름의 변수에
		 * 담아 보세요
		 */
		String str2 = str.toUpperCase();

		String greet = "Hello! mimi, Bye! mimi";
		// 위의 문자열에서 mimi라는 문자열을 mama라는 문자열로 교체해서 결과를 greet2에 담아 보세요
		// String 객체의 메소드를 활용해서
		String greet2 = greet.replace("mimi", "mama");

		String message = "My name is Dubu";
		/*
		 * 1. 위의 문자열에 My라는 문자열로 시작하는지 여부(true or false)를 is Start 라는 변수에 담아보세요
		 * 
		 * 2. 위의 문자열에서 i 가 문자열의 몇 번째 인덱스에 위치하고 있는지를 index라는 변수에 담아보세요
		 */
		boolean isStart = message.startsWith("My");
		int index = message.indexOf("i");

	}
}
