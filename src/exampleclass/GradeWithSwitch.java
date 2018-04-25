package exampleclass;

import java.util.Scanner;

public class GradeWithSwitch {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a grade ");
		char grade = input.next().toUpperCase().charAt(0);

		switch (grade) {
		case 'A':
			System.out.println("Exellent");
			break;
		case 'B':
			System.out.println("Good job");
			break;
		case 'C':
			System.out.println("Good");
			break;
		case 'D':
			System.out.println("Poor");
			break;
		case 'F':
			System.out.println("Fail");
			break;
		default:
			System.out.println("Invalid grade ABCD only");
		}
	}

}
