package test.mypac;

public class MyUtil {
	public static void draw() {
		System.out.println("5초동안 그림을 그려요!");
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("그림 완성!");
	}
	//메소드 안에서 발생하는 Exception 을 던져 버리는 경우
	//메소드를 호출하는 쪽에서 해당 예외를 처리해야 한다.
	public static void send() throws InterruptedException {
		System.out.println("5초동안 전송을 해요!");
		Thread.sleep(5000);
	}
}
