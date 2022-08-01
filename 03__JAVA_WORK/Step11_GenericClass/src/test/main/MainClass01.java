package test.main;

import test.mypac.Apple;
import test.mypac.Banana;
import test.mypac.FruitBox;
import test.mypac.Orange;

public class MainClass01 {
	public static void main(String[] args) {
		//Generic 클래스를 Apple 로 지정해서 FruitBox 객체 생성하기
		FruitBox<Apple> box1=new FruitBox<Apple>();
		//Method의 인자로 Apple type 전달하기
		box1.setItem(new Apple());
		//Method가 리턴해주는 Apple type 받아오기
		Apple item1=box1.getItem();
		
		//Generic  클래스를 Banana로 지정해서 Fruit 객체를 생성 위와 비슷한 작업을 해 보세요
		FruitBox<Banana> box2=new FruitBox<>();
		box2.setItem(new Banana());
		Banana item2=box2.getItem();
		
		
		FruitBox<Orange> box3=new FruitBox<Orange>();
		
	}

}
