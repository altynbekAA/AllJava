package exampleclass;

import java.util.Scanner;

public class Schedule {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter number for day");
		int day = input.nextInt();

		switch (day) {
		case 1:
			System.out.println(" today is Monday \n its work day");
			break;
		case 2:
			System.out.println(" today is Tuesday \n its work day ");
			break;
		case 3:
			System.out.println(" today is Wednesday \n its work day");
			break;
		case 4:
			System.out.println(" today is Thursday \n its work day");
			break;
		case 5:
			System.out.println(" today is Friday \n its work day");
			break;
		case 6:
			System.out.println(" today is Saturday \n its day off");
			break;
		case 7:
			System.out.println(" today is Sunday \n its day off");
			default:
			System.out.println(" go learn week days ");

		}
	}
}
