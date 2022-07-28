package test.auto;

public class CampingCar extends Car {

	public CampingCar(Engine engine) {
		super(engine);
	}

	public void camping() {
		System.out.println("차박도 가능한가?");
	}

	@Override
	public void drive() {
		System.out.println("달리기도 하고!");
	}
}
