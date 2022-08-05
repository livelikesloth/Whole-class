package test.main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainClass16 {
	public static void main(String[] args) {
		// 필요한 참조값을 담을 지역 변수를 미리 만든다.
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			// 1. jpg 에서 byte 를 읽어낼 객체
			fis = new FileInputStream("C:\\Users\\HNJN-PC\\Desktop\\school\\java_work\\myFolder\\1.jpg");
			//copied.jpg 에 byte를 출력할 객체
			fos = new FileOutputStream("C:\\Users\\HNJN-PC\\Desktop\\school\\java_work\\myFolder\\copied.jpg");
			//byte 알갱이를 담을 방 1024개 짜리 byte[]객체 생성
			byte[] buffer=new byte[1024];
			
			while (true) {	
				//byte[] 객체를 read() 메소드에 전달해서  byte를 읽어내고 몇 byte를 읽었는지 리턴 받는다
				int readByte=fis.read(buffer);
				System.out.println(readByte);
				//만일 더이상 읽을 byte 가 없다면
				if(readByte==-1)break;
				fos.write(buffer, 0, readByte);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// fos, fis 마무리 하기
			
				try {
					if(fis!=null)fis.close();
					if(fos!=null)fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
	}
}
