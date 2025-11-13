package p3;

public class P3_Main {

	public static void main(String[] args) {
		boolean x;
		boolean y;
		boolean a;
		x = false;
		y = false;
		
		a = !(x != y && x == y); // immer true
		System.out.println("A: " + a);
		a = x || true; // immer true
		System.out.println("A: " + a);
		a = x && false; // immer false
		System.out.println("A: " + a);
		a = (x && !y) || (!x); // FF: true; FT: true; TF: true; TT: false
		System.out.println("A: " + a);
	}
	
}
