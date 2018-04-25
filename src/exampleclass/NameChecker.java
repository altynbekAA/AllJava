package exampleclass;

import java.util.Scanner;

public class NameChecker {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Type your name:");
		String name = input.next();
		
		//char firstLetter = name.charAt(0);
		if(name.charAt(0) >= 65 && name.charAt(0) <= 90) {
			System.out.println("It started with capital letter");
		}else if(name.charAt(0) >= 97 && name.charAt(0) <= 122) {
			System.out.println("Your name should starts with capital letter stupid ");
		}else {
			System.out.println("Type String object");
			
				
		}
	}

}
