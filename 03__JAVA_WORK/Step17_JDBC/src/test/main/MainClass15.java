package test.main;

import test.dao.MemberDao;

public class MainClass15 {
	public static void main(String[] args) {
		int num = 3;
		
		/*
		 *  MemberDao 객체를 이용해서 위의 번호에 해당하는 회원정보를 삭제해 보세요
		 */
		boolean isSuccess = new MemberDao().delete(num);
		if(isSuccess) {
			System.out.println("삭제 성공");
		}else {
			System.out.println("삭제 실패");
		}
	}
}
