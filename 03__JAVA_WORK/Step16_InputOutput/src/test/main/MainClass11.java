package test.main;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class MainClass11 {
	public static void main(String[] args) {
		//문자열을 저장할 파일을 만들기 위한 File 객체
		File memoFile=new File("C:\\Users\\HNJN-PC\\Desktop\\school\\java_work\\myFolder\\memo.txt");
		try {
			/*
			 *  if(memoFile.exists() == false){ }
			 *  if(!memoFile.exist()){ }
			 *  위의 if 문은 동일한 if 문이다.
			 */
			//파일이 존재하지 않으면
			if(!memoFile.exists()) {
				//파일을 만든다
				memoFile.createNewFile();
			}
			//파일에 문자열을 출력할 수  있는 FileWriter 객체
			FileWriter fw = new FileWriter(memoFile, true);
			fw.write("나도 우영우 보고싶다.");
			fw.write("\r\n");
			fw.write("우 투더 영 투더 우!");
			fw.write("\r\n");
			fw.write("동 투더 그 투더 롸미~");
			fw.write("\r\n");
			fw.flush();
			fw.close(); // 출력을 다 했으면 마무리를 한다.
			System.out.println("파일에 문자열을 저장했습니다.");
		} catch (IOException e) {	
			e.printStackTrace();
		}
	}
}
