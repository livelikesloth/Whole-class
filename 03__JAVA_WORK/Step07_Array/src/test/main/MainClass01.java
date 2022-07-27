package test.main;

public class MainClass01 {
	public static void main(String[] args) {
		System.out.println("메인 메소드가 시작되었습니다.");
		// int type 5개를 저장하고 있는 배열
		int[] nums= {10, 20, 30, 40, 50};
		// double type 5개를 저장하고 있는 배열
		double[] nums2= {10.2, 10.2, 10.3, 10.4, 10.5};
		//boolean type 5개를 저장하고 있는 배열
		boolean[] truth= {true, false, false, true, true};
		//String type(참조 데이터 type) 5개를 저장하고 있는 배열
		String[] names= {"두부", "유키", "소주", "큐디", "하쿠"};
		
		//배열의 각각의 방 참조하기
		int result1=nums[0]; //10
		double result2=nums2[1]; // 10.2
		boolean result3=truth[2]; // false
		String result4=names[3]; //"큐디"
		
		//nums 배열을 복제해서 새로운 배열을 얻어내서 a에 대입하기
		int[] a=nums.clone();
		// nums 안에 있는 배열의 참조값을 b에 대입하기
		int[] b=nums;
		
		//배열의 방의 갯수 참조
		int size=nums.length;
		}
}
