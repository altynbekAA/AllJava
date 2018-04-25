package exampleclass;

import java.util.Scanner;

public class LineNumbers {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Number: ");
		int amount = input.nextInt(); 	

		
		System.out.println("Word: ");
		String word = input.next();
		 
		
		if  (word !=null) {
		 System.out.println("This is a number "+amount);	
		}else {
		
			System.out.println("This is a word "+word);
		}
				
	}

}
     
       



