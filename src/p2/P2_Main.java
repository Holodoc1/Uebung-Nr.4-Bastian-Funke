package p2;

public class P2_Main {

	public static void main(String[] args) {
		int a = 3;
		int b = 5;
		int c = 6;
		int intResult;
		double x = 1.5;
		double y = 2.3;
		double doubleResult;
		
		intResult = c - a * 3; // int; -3
		System.out.println("(a): " + intResult);
		intResult = c / b; // int; 1
		System.out.println("(b): " + intResult);
		intResult = a + b / c; // int; 3
		System.out.println("(c): " + intResult);
		doubleResult = (double) c / b; // double; 1.0
		System.out.println("(d): " + doubleResult);
		doubleResult = c + (double) a / b; // double; 6.0
		System.out.println("(e): " + doubleResult);
		doubleResult = x + y * b; // double; 13.0
		System.out.println("(f): " + doubleResult);
	}
	
}
