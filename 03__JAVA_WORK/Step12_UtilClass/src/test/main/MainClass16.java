package test.main;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class MainClass16 {
	public static void main(String[] args) {
		// 1. HashSet 객체를 생성해서 참조값을 
		// 정수를 저장 할 수있는 Set 인터페이스 타입 변수에 담아보세요
		Set<Integer> numb = new HashSet<>();
		
		/*
		 * 2. 반복문을 사용해 1~45 사이의 랜덤한 정수를 얻어내서 HashSet 객체에 담아보세요
		 * 총 6개가 담길 때 까지 반복문이 사용되어야 합니다.
		 * 주의) 우연히 이전에 나왔던 동일한 숫자가 나오면  HashSet은 하나만 저장하는걸 잊지 마세요
		 */
		
	
		while (numb.size()<6) {	
			Random ran = new Random();
			int a = ran.nextInt(45)+1;
			 numb.add(a);	
		}	
		
		//선생님
		// 외형상 무한루프인 while문을 구성하고
//		while(true) {
//			Random ran = new Random();
//			int a = ran.nextInt(45)+1;
//			 numb.add(a);
		//만일 numb 의 사이즈가 6이 되면
//			 if(numb.size()==6) {
//				 break;  반복문 탈출하기
//			 }
//		}
		// 3. HashSet 객체에 담긴 숫자를 콘솔창에 하나하나씩 모두 출력해 보세요.
		Iterator<Integer> it =numb.iterator();
		while(it.hasNext()) {
			int a = it.next();
			System.out.println(a);
		}
	}
}
