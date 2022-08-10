package test.mypac;

public class TestThread {
	public void run() {
		for (int i = 0; i < 10; i++) {
			// 스레드 0.5초 동안 대기
			try {
				Thread.sleep(500);
				System.out.println("Thread : " + i);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
