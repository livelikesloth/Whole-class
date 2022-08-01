package test.main;

import test.mypac.Calc;

public class MainClass05 {
	public static void main(String[] args) {
		Calc plus=(a, b)->{
			return a+b;
		};
		
		Calc minus=(a, b)->{
			return a-b;
		};
		
		Calc multi=(a, b) -> a*b;
		Calc divide=(a, b) -> a/b;
		
		
		double result1 = plus.exec(10, 20);
		double result2 = minus.exec(10, 20);
		double result3 = multi.exec(10, 20);
		double result4 = divide.exec(10, 20);
	}
}
