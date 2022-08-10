package test.main;

import test.mypac.TestThread;

public class MainClass extends Thread {
	public static void main(String[] args) {
		TestThread t1 = new TestThread();
		TestThread t2 = new TestThread();
		
		t1.run();
		t2.run();
		
	}

}
