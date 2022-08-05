package test.main;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;

public class MainClass06 {
	public static void main(String[] args) {
		PrintStream ps = System.out;
		// 학습을 위해서 PrintStream 객체를 부모타입 OutputStream 으로 받아보기
		// OutputStream도 1byte 처리 스트림.
		OutputStream os = ps;
		// 2byte 처리 스트림
		OutputStreamWriter osw = new OutputStreamWriter(os);

		BufferedWriter bw = new BufferedWriter(osw);
		try {
			bw.write("하나");
			bw.write("\r\n");
			bw.write("두울");
			bw.newLine();
			bw.write("\t세엣");
			bw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
