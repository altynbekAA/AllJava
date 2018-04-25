package HomeTasks;

import java.util.Scanner;

public class Alfavit {
	public static void main(String... args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Input an alphabet:");
		String alphabet = input.next();

		if (alphabet.equalsIgnoreCase("a")) {
			System.out.println("Input letter is vowel");

		} else if (alphabet.equalsIgnoreCase("e")) {
			System.out.println("Input letter is vowel");

		} else if (alphabet.equalsIgnoreCase("i")) {
			System.out.println("Input letter is vowel");

		} else if (alphabet.equalsIgnoreCase("o")) {
			System.out.println("Input letter is vowel");

		} else if (alphabet.equalsIgnoreCase("u")) {
			System.out.println("Input letter is vowel");

		} else if (alphabet.length() > 1) {
			System.out.println("Error");
		} else {
			System.out.println("Input letter is Consonant");
		}

	}
}
