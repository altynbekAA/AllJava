package HomeTasks;

import java.util.Scanner;

public class EqualnotEqual {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter first number");
		int first = input.nextInt();
		
		System.out.println("Enter second number");
		int second = input.nextInt();
		
		boolean equal = first==second;
		if (first==second) {
			System.out.println("Number "+first+" and number "+second+" are equal: "+equal);
		}else {
			System.out.println("Number "+first+" and number "+second+" are not equal: "+equal);
		}
		
		
	
}
}