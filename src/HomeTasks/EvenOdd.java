package HomeTasks;

import java.util.Scanner;

public class EvenOdd {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your number");
		int result = input.nextInt();
		
		
		boolean isEven = (result%2==0);
		if (isEven) {
		System.out.println("Your number is even: " + isEven);
		
		} else{
		System.out.println("Your number is odd: "+isEven);
		}
		 
		
		
		
	}

}
