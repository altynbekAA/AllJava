package exampleclass;

import java.util.Scanner;

public class TipCalculator {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String split;
		int numberOfPeople = 1;
		 double checkAmount;
		 String qualityOfService;
		 
		Tip tip = new Tip();
  
		
		
		do {		System.out.println("Do you want to split? Yes or No");
		       split = input.next();
  	      
           }while(!split.equalsIgnoreCase("yes") && (!split.equalsIgnoreCase("no")) ); 
		 if (split.equalsIgnoreCase("yes")) {
		    System.out.println("How many people?");
    			 numberOfPeople = input.nextInt();
    			System.out.println("What is the check amount?");
    	        checkAmount = input.nextDouble();
    			System.out.println("What is the service quality?");
    		    qualityOfService = input.next();
   			tip.calculateBill(numberOfPeople, checkAmount, qualityOfService, split);
   			
		 }else {
			System.out.println("What is the check amount?");
 	        checkAmount = input.nextDouble();
 			System.out.println("What is the service quality?");
 		    qualityOfService = input.next();
 		    tip.calculateBill(numberOfPeople, checkAmount, qualityOfService, split);
			 
		 }

			
		}

	}


