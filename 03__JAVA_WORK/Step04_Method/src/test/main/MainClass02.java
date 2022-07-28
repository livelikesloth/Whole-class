package test.main;

import test.mypac.Car;
import test.mypac.myObject;

public class MainClass02 {
	public static void main(String[] args) {
		// Car 객체의 참조값을 얻어내서 Drive() 메소드를 여기서 호출해 보세요.
		new myObject().getCar().drive();

		// 위의 1줄을 풀어서 쓰면 아래와 같다.
		myObject obj = new myObject();
		Car car1 = obj.getCar();
		car1.drive();

		myObject myObj = new myObject();
		myObj.getCar().drive();
	}
}
