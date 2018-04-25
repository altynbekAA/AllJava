package exampleclass;

import java.util.Scanner;

public class SeasonDrink {
	public static void main(String[] args) {
		   Scanner input = new Scanner(System.in);
		   
		   System.out.println("Please enter month number:");
		   int number = input.nextInt();
		   
		   if(number==12 || number<=2) {
			   System.out.println(" Winter: \n Drink: Pumpkin spice");
			  // System.out.println("Drink: Pumpkin spice");
		   
		   }else if(number>=3 && number<=5 ) {
			   System.out.println("Spring");
			   System.out.println("Drink: Caramel Macchiato");
		  
		   }else if(number>=6 && number<=8) {
			   System.out.println("Summer");
		       System.out.println("Drink: Iced Coffee");
		    	   
		   } else if(number>=9 && number<=11) {
			  System.out.println("Spring");
			  System.out.println("Drink:Caramel Machiato");
				  
			  }else {
				  System.out.println("Invalid");
			  }
			   
	}

}







