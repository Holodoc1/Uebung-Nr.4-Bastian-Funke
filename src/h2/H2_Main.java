package h2;

public class H2_Main {

	public static void main(String[] args) {
		boolean x = true;
		boolean y = false;
		boolean a = true;
		boolean b = true;
		boolean c = true;
		int input = 10;
		
		switch(input) {
		case 0:
			x = false;
			y = false;
			c = true;
			break;
		case 1:
			x = false;
			y = true;
			c = false;
			break;
		case 10:
			x = true;
			y = false;
			c = true;
			break;
		case 11:
			x = true;
			y = true;
			c = false;
			break;
		}
		a = (x && y);
		b = x || (x != y);
		System.out.println("Input: " + input);
		System.out.println("x: " + x);
		System.out.println("y: " + y);
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		System.out.println("c: " + c);
	}
	
}
