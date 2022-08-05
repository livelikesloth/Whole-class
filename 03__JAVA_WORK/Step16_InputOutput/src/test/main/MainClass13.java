package test.main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MainClass13 {

	public static void main(String[] args) {
		// 문자열을 저장할 파일을 만들기 위한 File 객체
		File file = new File("C:\\Users\\HNJN-PC\\Desktop\\school\\java_work\\myFolder\\memo.txt");

		try {
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			br.readLine();
			while(true) {
				//문자열 한줄 읽어내기
				String line = br.readLine();// 개행기호는 읽어내지 않는다.
				//더이상 읽을 데이터가 없으면 반복문 탈출
				if(line==null) {
					break;
				}
				System.out.println(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
