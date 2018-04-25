package exampleclass;

import java.util.Scanner;

public class Test2542 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter how many minutes");
		int minutes = input.nextInt();
		
		float hours = minutes/60f;
		 float second = hours/60;
		 System.out.println("hours "+hours+" second "+second);
		 
		
	}

}
