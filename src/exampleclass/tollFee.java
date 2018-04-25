package exampleclass;

public class tollFee {
	public static void main(String[] args) {
		int carType = 3;
		double fee = 0;
		switch (carType) {
		case 1:
			fee = 2.5;
			System.out.println("Total fee for Car: $" + fee);
			break;
		case 2:
			fee = 5.00;
			System.out.println("Total fee for Bus: $" + fee);
			break;
		case 3:
			fee = 6.5;
			System.out.println("Total fee for Truck: $" + fee);
			default:
				System.out.println("You can go free");
			
		}
	}
}