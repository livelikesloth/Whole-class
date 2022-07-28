package test.main;
import test.auto.Engine;
import test.auto.Haku;
public class MainClass07 {
	public static void main(String[] args) {
		//Haku 객체를 생성해서 참조값을 car1 이라는 지역 변수에 담아보세요
		Haku car1 = new Haku(new Engine());		
		//car1 에 들어있는 참조값을 이용해서 달리기도 하고 통통 튀기도 해 보세요
		car1.drive();
		car1.goCartFeeling();	
		car1.camping(); 
	}
}