package test.main;

public class MainClass06 {
	public static void main(String[] args) {
		// method 안쪽에서 만드는 변수를 지역변수(local variable)라 한다.
		// java에는 전역변수가 없다 local variable(지역변수) or field
		System.out.println("main method 가 시작되었습니다.");

		int num1;
		String name1;

		// 아직 만들어 지지 않았기 때문에 num1 은 참조 불가
		// int result =10+num1;

		// 아직 만들어 지지 않았기 때문에 name1은 참조 불가
		// System.out.println("name1:"+name1);

		System.out.println("main method 가 종료됩니다.");
	}
}
