package HomeTasks;

import java.util.Scanner;

public class PrintString {
	public static void main(String[] args) throws InterruptedException {

		Scanner input = new Scanner(System.in);
		System.out.println("Input any word");
		String word = input.nextLine();

		char letter;

		for (int size = word.length() - 1; size >= 0; size--) {

			letter = word.charAt(size);

			System.out.print(letter + " ");
			Thread.sleep(600);

		}

	}
}
