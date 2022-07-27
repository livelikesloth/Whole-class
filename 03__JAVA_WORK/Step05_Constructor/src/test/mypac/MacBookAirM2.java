package test.mypac;

public class MacBookAirM2 {
	// 외부에서 접근 불가하도록 접근 지정자를 private로 해서 필드 3개 선언하기
	private Cpu cpu;
	private Memory memory;
	private HardDisk hardDisk;

	// 생성자
	public MacBookAirM2(Cpu cpu, Memory memory, HardDisk hardDisk) {
		this.cpu = cpu;
		this.memory = memory;
		this.hardDisk = hardDisk;
	}

	// 메소드
	public void playGame() {
		if (this.cpu == null || memory == null || hardDisk == null) {
			System.out.println("부품이 부족해서 맥북에어M2가 동작을 할 수 없습니다.");
			return; // 메소드를 여기서 끝내기
		}
		System.out.println("신나게 게임을 해요!");
	}
}
