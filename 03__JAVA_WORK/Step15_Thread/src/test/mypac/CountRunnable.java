package test.mypac;
/*
 *  새로운 스레드를 만드는 방법2
 *  
 *   1. Rannable 인터페이스를 구현한 클래스를 정의한다.
 *   2. run() 메소드를 강제 오버라이드 한다.
 *   3. Thread 클래스로 객체를 생성하면서 해당 클래스로 만든 객체를 생성자의 인자로 전달한다.
 *   4. Thread 클래스로 만든 객체의 start() 메소드를 호출해서 스레드를 시작 시킨다.
 */
public class CountRunnable implements Runnable {

	@Override
	public void run() {
		Thread t = new Thread(new CountRunnable());
		t.start();
		//아래의 내용이 즉시 콘솔창에 출력된다.
		System.out.println("새로운 스레드가 시작되었습니다.");
	}
}
		
