package test.main;

import test.mypac.Drill;

public class MainClass04 {
	public static void main(String[] args) {
		useDrill(new Drill() {
			@Override
			public void hole() {
				System.out.println("벽에 구멍을 뚫어요!");
			}
		});
		useDrill(() -> {
			System.out.println("구멍에 벽을 뚫어요!");
		});
		
		Drill d2=()->{ 
			System.out.println("뚫어에 벽을 구멍해요!");
		};
		//위는 아래의 줄임 표현이다
		Drill d3=new Drill() {
			@Override
			public void hole() {
				System.out.println("구뚫벽에어을멍요!");
				}
		};
		useDrill(d2);
		d2.hole();
		d3.hole();
		
	}

	public static void useDrill(Drill d) {
		d.hole();

	}
}
