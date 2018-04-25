package exampleclass;

import java.util.Scanner;

public class Conditinals {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("What do you want to drink ");
		String drink = input.next();
		
		if(drink.equals("tea")) {
			System.out.println("With sugar or no sugar?");
			String sugar = input.next();
			System.out.println("Here is "+sugar+" tea");
			
		
		}else if(drink.equals("water")) {
			System.out.println("With ice or no ice?");
			String noIce = input.next();
			System.out.println("Here is your "+noIce+" water");
		
		
		
		}else if(drink.equals("juice")) {
			System.out.println("Which kind of juice?");
			String apple = input.next();
			System.out.println("Here is your "+apple+" juice");
		
		}else {
			System.out.println("We dont have like that drink: Sorry");
		}
		
		
		
         //boolean hot= false;
         //boolean cold = false;
         
//         if(drink.equals(anObject))) {
//        	 System.out.println("You selected water");
//         
//         }else if(hot) {
//        	 System.out.println("Do you want tea or coffee?");
//         }else {
//        	 System.out.println("Drink not selected:");
//         }
//         
         
         
		
		  
	}

}
