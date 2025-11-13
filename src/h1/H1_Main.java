package h1;

public class H1_Main {

	public static void main(String[] args) {
		int zone = 900;
		double price = 33.0;
		
		price = 2.0;
		switch(zone) {
		case 0:
		case 1:
			break;
		case 2:
			price = 2.35;
			break;
		case 3:
		case 4:
			price = 2.85;
			break;
		case 5:
			price = 3.55;
			break;
		case 6:
		default:
			price = 4.0;
		}
		System.out.println("Zone: " + zone);
		System.out.println("Preis: " + price);
	}
	
}
