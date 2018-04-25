package HomeTasks;

import java.util.Scanner;

public class MiddleCharacter {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Input any word ");
		String anyWord = input.next();

		int size;
		if (anyWord.length() % 2 == 0) {
			size = anyWord.length();
			anyWord.substring((size / 2) - 1, (size / 2) + 1);
			String n = anyWord.substring((size / 2) - 1, (size / 2) + 1);
			System.out.println("Middle charachter is " + n);
		} else {
			size = anyWord.length();

			String n = anyWord.substring((size / 2), (size / 2) + 1);

			System.out.println("Middle charachter is " + n);

		}
	}
}
