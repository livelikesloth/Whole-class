package test.mypac;

public class Car {
	// 생성자( new  할때 호출되는 부분)
	Car(){//클래스명()
		System.out.println("Car  생성자 호출됨!");
	}
	//non static 메소드
	public void drive() {
		System.out.println("달려요!");
	}
}
