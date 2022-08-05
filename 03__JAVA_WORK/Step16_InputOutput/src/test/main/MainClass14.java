package test.main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MainClass14 {

	public static void main(String[] args) {
		// 문자열을 저장할 파일을 만들기 위한 File 객체
		File file = new File("C:\\Users\\HNJN-PC\\Desktop\\school\\java_work\\myFolder\\memo.txt");
		FileReader fr = null;
		BufferedReader br = null;
		try {
			// 파일에서 문자열을 읽어들일 수 있는 객체 생성
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			br.readLine();
			while (true) {
				// 문자열 한줄 읽어내기
				String line = br.readLine();// 개행기호는 읽어내지 않는다.
				// 더이상 읽을 데이터가 없으면 반복문 탈출
				if (line == null) {
					break;
				}
				System.out.println(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {// 예외가 발생하던 안하던 실행이 반드시 보장되는 블럭
			//예외가 발생한다면 tryCatch 블럭으로 묶어주고 
			try {
				//NullPointerException 을 방지하면서 마무리 작업을 한다.
				if(br!=null)br.close();
				if(fr!=null)fr.close();

			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
}
