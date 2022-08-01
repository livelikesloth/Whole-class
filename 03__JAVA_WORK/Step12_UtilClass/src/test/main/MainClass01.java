package test.main;

import java.util.ArrayList;

public class MainClass01 {
	public static void main(String[] args) {
		ArrayList<String> names=new ArrayList<String>();
		// "dubu" , "yuki" , "soju"  3개의 String type을 저장해 보세요
		names.add("dubu");
		names.add("yuki");
		names.add("soju");
		
		//0번방의 아이템을 불러와서 item이라는 변수에 담아 보세요
		String item = names.get(0);
		//1번방의 아이템을 삭제하려면
		String item2 = names.remove(1);
		//0번방에 Beale을 넣고 싶으면?
		names.set(0, "Beale");
		//저장된 아이템의 갯수(size)를 size 라는 지역변수에 담아보세요
		int size=names.size();
		//저장된 모든 아이템 전체 삭제
		names.clear();
		
	}
}
