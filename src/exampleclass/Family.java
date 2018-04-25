package exampleclass;

import java.util.Scanner;

public class Family {

	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.println("What is your name?");
		String name = input.next();

		if (name.equalsIgnoreCase("Abdurasul")) {
			System.out.println("My name is Yrysov Abdurasul and i am 51 years old");

		} else if (name.equalsIgnoreCase("Buajar")) {
			System.out.println("My name is Yrysova Buajar and i am 49 years old");

		} else if (name.equalsIgnoreCase("Dinara")) {
			System.out.println("My name is Yrysova Dinara and i am 27 years old");

		} else if (name.equalsIgnoreCase("Altynbek")) {
			System.out.println("My name is Altynbek Abdurasulov and i am 25 years old");
		} else {
			System.out.println("You are not part of our family");
		}
	}
}
