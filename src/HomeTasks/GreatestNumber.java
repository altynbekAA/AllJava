package HomeTasks;

import java.util.Scanner;

public class GreatestNumber {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter first number");
		int first = input.nextInt();
		
		System.out.println("Enter second number");
        int second = input.nextInt();
		
        System.out.println("Enter third number");
        int third = input.nextInt();
		
        
        if(first>second && first>third) {
        	System.out.println("The greatest number is "+first);
         }
        if (second>first && second>third) {
        	System.out.println("The greatest number is "+second);
        }
        if (third>first && third>second) {
        	System.out.println("The greatest number is "+third);
        }
        
		
				
	}
}

