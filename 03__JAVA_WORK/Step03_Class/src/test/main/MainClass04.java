package test.main;
import test.mypac.MyUtil;
public class MainClass04 {
	public static void main(String[] args) {
		/*
		 * MyUtil 클래스에 있는 send() 메소드를 호출하고 싶다면?
		 * 
		 * static 메소드 이기 떄문에 new 하지 않고
		 * 
		 * import 후에 클래스명에 .을 찍어서 호출 할 수 있다.
		 */
		
		// static 메소드 호출
		MyUtil.send();
		//static 필드 참조
		String v=MyUtil.version;
	}
}
