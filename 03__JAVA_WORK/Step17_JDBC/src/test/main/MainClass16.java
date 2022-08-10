package test.main;

import java.util.Scanner;

import test.dao.MemberDao;
import test.dto.MemberDto;

public class MainClass16 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.println("검색할 회원의 번호 입력 (종료:q)");
			String str = scan.nextLine();
			if (str.equals("q")) {
				System.out.println("검색이 종료됩니다.");
				break;
			}
			int num = Integer.parseInt(str);
			System.out.println(num + " 번 회원의 정보 조회중...");
			
			// MemberDao 객체를 이용해서 입력한 번호에 해당하는 회원 정보를 얻어와서
			MemberDao dao = new MemberDao();
			MemberDto mem = dao.getData(num);
			// 회원 정보가있으면 아래와 같은 형식으로 회원정보를 출력하고
			// 이름 => 두부, 주소 => 페어펙스
			if (mem != null) {
				System.out.println("이름 => " + mem.getName() + ", 주소 => " + mem.getAddr());
			} else {
				System.out.println(num + " 번 회원은 존재하지 않습니다.");
			}
			// 회원 정보가 없으면
			// x번회원은 존재하지 안습니다. 를 출력하도록 프로그래밍 하시오
		}
		System.out.println("app 이 종료 됩니다.");
	}
}
