package test.main;

public class MainClass03 {
	public static void main(String[] args) {
		System.out.println("main 메소드가 시작 되었습니다.");
		//String type 을 담을 수 있는 방 3개짜리 빈 배열객체를 만들어서 참조값을 지역변수 names 에 담기
		//String[]names= {null, null, null};	
		String[] names=new String[3];
		//각각의 방에 순서대로 문자열 대입하기
		names[0]="두부";
		names[1]="유키";
		names[2]="소주";
		
		//반복문 돌면서 베열에 저장된 문자열을 순서대로 콘솔창에 출력하기
		for (int i = 0; i < names.length; i++) {
			//i 번째 방에 저장된 아이템 참조
			String tmp=names[i];
			//출력		
			System.out.println(tmp);
		
		}
	}
}
