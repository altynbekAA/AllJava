package HomeTasks;

import java.util.Scanner;

public class Pyramid {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.err.println("Enter number for pyramid");
		int number =10;// scan.nextInt();

		for (int i = 1; i <= number; i++) {
			System.err.println();

			for (int f = 1; f <= number - i; f++) {
				System.err.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.err.print("* ");

			}
		}

	}
}