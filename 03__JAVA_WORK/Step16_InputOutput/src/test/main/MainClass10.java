package test.main;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;

public class MainClass10 {
	public static void main(String[] args) {
		File f1 = new File("C:\\Users\\HNJN-PC\\Desktop\\school\\java_work\\myFolder\\folder1");
		
		for (int i = 0; i < 1000; i++) {
			f1= new File("C:\\Users\\HNJN-PC\\Desktop\\school\\java_work\\myFolder\\folder"+(i+1));
			if(f1.exists()) {
				f1.delete();
			}else {
				f1.mkdir();
			}
		}

		/*
		 * 
		 * 위의 코드를 참조해서 C:\\Users\\HNJN-PC\\Desktop\\school\\java_work\\myFolder 폴더 안에
		 * 폴더명은 folder1 folder2 ... 1000개 만들기
		 */
	}
}
