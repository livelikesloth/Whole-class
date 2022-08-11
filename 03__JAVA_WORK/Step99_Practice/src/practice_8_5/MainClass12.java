package practice_8_5;

import java.util.Scanner;

public class MainClass12 {
	public static void main(String[] args) {	
		
		String scannn=scann();
		char[] scannnn=scannn.toCharArray(); 
		int scannnnn = scannnn.length;
		System.out.println(scannnnn);
	}
	public static String scann() {
		Scanner scan = new Scanner(System.in);
		return scan.nextLine();		
	}
}
