package test.main;

import test.mypac.Arrow;
import test.mypac.Gun;
import test.mypac.Radio;
import test.mypac.myObject;

public class MainClass04 {
	public static void main(String[] args) {
		myObject obj = new myObject();
		obj.setNum(1872);
		obj.setName("Dubu");

		// useRadio() 메소드를 호출해 보세요

		// 메소드의 인자로 전달할 값이 이미 준비 되어 있을 수도 있다
		Radio r = new Radio();
		// 이미 준비 되어 있다면 메소드를 호출하면서 준비된 값을 참조해서 전달하면 된다.
		obj.useRadio(r);
		obj.useRadio(new Radio());
//		r.listenMusic();

		//attack() 메소드를 호출해 보세요
		Gun g = new Gun();
		Arrow a = new Arrow();
		obj.attack(g, a);
	}
}
