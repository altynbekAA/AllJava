package exampleclass;

import java.util.Scanner;

public class CarSalon {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("What country car do you want? ");
		String car = input.next();
		
		
		//int num1= 2;
		//int num3= 2;
		
		
		if(car.equalsIgnoreCase("German")) {
			System.out.println("You selected German car");
			System.out.println("What is your budget?");
            double amount1 = input.nextDouble();
            if(amount1>=5000) {
            	System.out.println("You are able to buy this car");
            }else if(amount1<=5000) {
            	System.out.println("I will advice you go to American delaer ship");
            }
			
			
		
		}else if(car.equalsIgnoreCase("American")) {
			System.out.println("You selected American car");
			System.out.println("What is your budget?");
			double amount2 = input.nextDouble();
            if( amount2>=3000) {
            	System.out.println("You are able to buy this car");
            }else if(amount2<=3000) {
            	System.out.println("You are not able to buy this car");
            }
		
		}else if(car.equalsIgnoreCase("Japanese")){
			System.out.println("You selected Japanese car");
			System.out.println("What is your budget?");
			double amount3 = input.nextDouble();
			if(amount3>=2000) {
				System.out.println("You are able to buy this car");
             }else if(amount3<=3000) {
				System.out.println("Come back with more money");
			}


		}
			
		
	}

}
