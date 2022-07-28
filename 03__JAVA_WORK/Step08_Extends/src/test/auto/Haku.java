package test.auto;

public class Haku extends CampingCar{
	// Engine type 을 전달받는 생성자
	public Haku(Engine engine) {
		//부모생성자를 호출하면서 필요한 값을 전달해 준다.
		super(engine);
	}
	public void goCartFeeling() {
		System.out.println("통통튄다고!");
	}
	
}
