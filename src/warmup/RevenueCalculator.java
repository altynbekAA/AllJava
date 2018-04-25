package warmup;
import java.util.*;

public class RevenueCalculator {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		double price, unit, d10, d15;
		
		
		System.out.println("Enter price...");
		price = userInput.nextDouble();
		
		System.out.println("Enter units...");
		unit = userInput.nextDouble();
		double total = unit*price;
		
		System.out.println("Reven is "+ (unit*price));
		if(unit>=100 & unit<= 120) {
			d10=total*0.1;
			
			System.out.println("after discount..."+(total-d10) );
			
		}//10%
		
		if(unit>120) {
			d15=total*0.15;
			System.out.println("after discount..."+(total-d15) );

			
		}//15%
		else { System.out.println("No discount");
		}
		
		
		
	}

	
	
	
	
	
}

