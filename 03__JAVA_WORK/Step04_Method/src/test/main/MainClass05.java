package test.main;

import test.mypac.Messenger;
import test.mypac.Radio;

public class MainClass05 {
	public static void main(String[] args) {
		// Messenger 클래스의 sendMessage(), getMessage(), useRadio() 메소드를 호출해 보세요
		Messenger.sendMessage("두부야 안녕?");
		Messenger.getMessage();
		Messenger.useRadio(new Radio());

	}
}
