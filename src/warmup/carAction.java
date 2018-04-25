package warmup;
import java.util.Scanner;
public class carAction {
	public static void main(String[] args) {
		
		car yourCar = new car();
		yourCar.model="Tesla";
		yourCar.color="White";
		yourCar.currentSpeed=45;
		

		Scanner input = new /*awd*/ Scanner(System.in);
		
		
		System.out.println("Putting new car to the road...");
		System.out.println("Choose your car model");
		String model = /*sesesfsef*/ input.next();
		
		System.out.println("Choose your car color");
		String carColor=input.next();
		
		System.out.println("Choose your car current speed");
		int carSpeed=input.nextInt();
		
		
		
	
		
		yourCar.printCarInformation();
		
		yourCar.accelearte(30);
		
		yourCar.printCarInformation();
		
		int totalSpeed = yourCar.getCurrentSpeed();
		System.out.println("Speed after accelaration "+totalSpeed);
		
        
		
		
		
	}

}
