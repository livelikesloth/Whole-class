package test.main;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;

public class MainClass05 {
	public static void main(String[] args) {
		PrintStream ps = System.out;
		//학습을 위해서 PrintStream 객체를 부모타입 OutputStream 으로 받아보기
		//OutputStream도 1byte 처리 스트림.
		OutputStream os=ps;
		// 2byte 처리 스트림
		OutputStreamWriter osw = new OutputStreamWriter(os);
		try {
			osw.write(97);
			osw.write(44032);
			osw.flush();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
}
