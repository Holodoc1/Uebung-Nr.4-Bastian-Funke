package h3;

public class H3_Main {

	public static void main(String[] args) {
		float celsiusFloat = 33.23F;
		float fahrenheitFloat = 10000000.0F;
		double celsiusDouble = 33.23;
		double fahrenheitDouble = 10000000.0;
		
		fahrenheitFloat = (1.8F * celsiusFloat)+ 32;
		fahrenheitDouble = (1.8 * celsiusDouble) + 32;
		System.out.println("fahrenheitFloat: " + fahrenheitFloat);
		System.out.println("fahrenheitDouble: " + fahrenheitDouble);
	}
	
}
