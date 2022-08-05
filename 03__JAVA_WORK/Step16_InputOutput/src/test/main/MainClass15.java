package test.main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainClass15 {
	public static void main(String[] args) {
		// 필요한 참조값을 담을 지역 변수를 미리 만든다.
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			fis = new FileInputStream("C:\\Users\\HNJN-PC\\Desktop\\school\\java_work\\myFolder\\1.jpg");
			fos = new FileOutputStream("C:\\Users\\HNJN-PC\\Desktop\\school\\java_work\\myFolder\\copied.jpg");

			while (true) {
				//1byte 읽어내기
				int data = fis.read();
				System.out.println(data);
				//읽어낸 1byte 출력하기
				fos.write(data);
				fos.flush();
				//다 읽어냈으면 탈출
				if (data == -1)break;				
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// fos, fis 마무리 하기
			
				try {
					if(fis!=null)fis.close();
					if(fos!=null)fos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	}
}
