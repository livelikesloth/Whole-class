package test.main;

import test.mypac.RemoteController;

public class MainClass02 {
	
	// RemoteController 인터페이스를 구현한 innerClass
	static class YourRomote implements RemoteController{
		@Override
		public void up() {
			System.out.println("바지를 올려요!");			
		}
		@Override
		public void down() {
			System.out.println("바지를 내");			
		}		
	}
	
	public static void main(String[] args) {
		RemoteController r1 = new YourRomote();
		useRemote(r1);
		}

	//RemoteController 인터페이스 type 을 인자로 전달받는 static 메소드
	public static void useRemote(RemoteController r) {
		r.up();
		r.down();
	}
}
