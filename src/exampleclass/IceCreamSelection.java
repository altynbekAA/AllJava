package exampleclass;

import java.util.Scanner;

public class IceCreamSelection {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your icecream selection:");

		String selection = input.nextLine();

		switch (selection) {
		case "Strawberry":
			System.out.println("You selected Strawberry");

			break;

		case "Cranberry":
			System.out.println("You selected Cranberry");

			break;
		case "Rasberry":
			System.out.println("You selected Rasberry");

			break;
		case "Bluberry":
			System.out.println("You selected Blueberry");

			//break;
		default:
            System.out.println("Default is a chocolate flavor. ");
		
		case "Banana":
			System.out.println("You selected Banana");

		}
	}

}
