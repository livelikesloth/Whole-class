package test.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class MainClass03 {
	public static void main(String[] args) {
		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is);
		// 문자열을 한줄씩 입력 받을 수 있는 객체
		BufferedReader br = new BufferedReader(isr);
		System.out.println("문자열 입력 : ");
		try {
			String line = br.readLine();
			System.out.println("line : " + line);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
