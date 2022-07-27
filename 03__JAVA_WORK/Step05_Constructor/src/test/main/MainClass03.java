package test.main;

import test.mypac.Cpu;
import test.mypac.HardDisk;
import test.mypac.MacBookAirM2;
import test.mypac.Memory;

public class MainClass03 {
	public static void main(String[] args) {
		// 1. MacBookAirM2 객체를 생성해서 참조값을 mac1 이라는 지역 변수에 담아보세요
		MacBookAirM2 mac2 = new MacBookAirM2(new Cpu(),new Memory(), new HardDisk());

		// 2. mac1 지역변수에 들어있는 참조값을 이용해서 playGame() 메소드를 호출해서 게임을 해보세요
		mac2.playGame();
		// 1. MacBookAirM2 객체를 생성해서 참조값을 mac1 이라는 지역 변수에 담아보세요
		Cpu cpu = new Cpu();
		HardDisk hardDisk = new HardDisk();
		Memory memory = new Memory();
		MacBookAirM2 mac1 = new MacBookAirM2(cpu, memory, hardDisk);

		// 2. mac1 지역변수에 들어있는 참조값을 이용해서 playGame() 메소드를 호출해서 게임을 해보세요
		mac1.playGame();

	}
}
