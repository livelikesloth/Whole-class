package test.main;

import java.util.HashMap;

public class MainClass10 {
	public static void main(String[] args) {
		/*
		 * 회원정보는 숫자(int), 문자(String)으로 구성되어 있기 때문에
		 * value의 generic은 Object로 지정해야 한다.
		 */
		HashMap<String, Object> map = new HashMap<>();
		//value의 generic이 object 이기 때문에 어떤 type 이든지 담을 수 있다.
		map.put("num", 1);
		map.put("name", "Dubu");
		map.put("addr", "Fairfax");
		
		//Object 타입으로 리턴되기 때문에 원래 타입으로 casting 해 주어야 한다.
		int num=(int)map.get("num");
		String name=(String)map.get("name");
		String addr=(String)map.get("addr");
		
	}
}
