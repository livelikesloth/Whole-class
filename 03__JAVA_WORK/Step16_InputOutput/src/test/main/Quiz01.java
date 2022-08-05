package test.main;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		// quiz.txt 파일을 access 할 수 있는 File 객체 생성
		// 없으면 만들 수도 있고, 있다면 수정 혹은 삭제
		File f = new File("C:\\Users\\HNJN-PC\\Desktop\\school\\java_work\\myFolder\\quiz.txt");

		Scanner sc = new Scanner(System.in);

		System.out.print("문자열 입력 : ");
		String text = sc.nextLine();
		// 필요한 객체를 담을 지역변수를 미리 만들어 놓기.
		FileWriter writer = null;
		BufferedWriter bw = null;
		try {
			if (!f.exists()) {
				f.createNewFile();
			}
			// 미리 만들어 놓은 지역변수에 참조값 넣어주기
			writer = new FileWriter(f, true);
			bw = new BufferedWriter(writer);
			bw.newLine(); // 개행기호 출력하기
			bw.write(text);
			bw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (bw != null)
					bw.close();
				if (writer != null)
					writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}