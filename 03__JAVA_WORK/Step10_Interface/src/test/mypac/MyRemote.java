package test.mypac;

public class MyRemote implements RemoteController {

	@Override
	public void up() {
		System.out.println("채널이 올라갑니다~");
	}

	@Override
	public void down() {
	System.out.println("채널이 내려갑니다~");
	}

}
