package HomeTasks;

import java.util.Scanner;

public class MonthDays {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Input a month number: ");
		int number = input.nextInt();

		if (number == 1) {
			System.out.println("January has 31 days.");
		} else if (number == 2) {
			System.out.println("Feburary has 28 days.");

		} else if (number == 3) {
			System.out.println("March has 31 days.");

		} else if (number == 4) {
			System.out.println("April has 30 days.");

		} else if (number == 5) {
			System.out.println("May has 31 days.");

		} else if (number == 6) {
			System.out.println("June has 30 days.");

		} else if (number == 7) {
			System.out.println("July has 31 days.");

		} else if (number == 8) {
			System.out.println("August has 31 days.");

		} else if (number == 9) {
			System.out.println("September has 30 days.");

		} else if (number == 10) {
			System.out.println("October has 31 days.");

		} else if (number == 11) {
			System.out.println("November has 30 days.");

		} else if (number == 12) {
			System.out.println("December has 31 days.");

		} else {
			System.out.println("Sorry you put invalid number");
		}
	}
}
