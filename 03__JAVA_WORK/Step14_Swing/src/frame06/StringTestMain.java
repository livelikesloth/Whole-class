package frame06;

public class StringTestMain {
	public static void main(String[] args) {
		System.out.println("main 메소드가 시작 되었습니다.");
		//  디버깅 모드로 실행해서 name1~name5 안에 들어있는 참조값을 비교.
		String name1="두부";
		String name2="두부";
		String name3= new String("두부");
		String name4= new String("두부");
		
		char[] arr= {'두','부'};
		String name5 =new String(arr);
	}
}
