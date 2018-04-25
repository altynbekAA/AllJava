package HomeTasks;

import java.util.Scanner;

public class Chicago {
	public static void main(String... name) {
		Scanner console = new Scanner(System.in);

		System.out.println("For how much you looking for apartmnets in Chicago? ");
		int money = console.nextInt();

		if (money >= 800 && money <= 1200) {
			System.out.println("You will get nice 1 bedroom");
		} else if (money >= 1200 && money <= 1500) {
			System.out.println("You will get nice 2 bedroom");
		} else if (money >= 1500 && money <= 2000) {
			System.out.println("You will get nice 3 bedroom");
		} else if (money < 800 && money > 650) {
			System.out.println("It is possible, but hard");
		} else if (money >= 2000) {
			System.out.println("Your money enough to get apartment in downtown");
		} else {
			System.out.println("Sorry your money is not enough to get money");

		}

	}
}
