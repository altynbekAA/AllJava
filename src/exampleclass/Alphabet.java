package exampleclass;

import java.util.Scanner;

public class Alphabet {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Input an alphabet: ");
		String character = input.next().toLowerCase();

		boolean uppercase = character.charAt(0) >= 65 && character.charAt(0) <= 90;
		boolean lowercase = character.charAt(0) >= 97 && character.charAt(0) <= 122;
		boolean vowels = input.equals("a") || input.equals("e") || input.equals("i") || input.equals("o")
				|| input.equals("u");
		if (character.length() > 1) {
			System.out.println("Error. Not a single character.");
		} else if (!(uppercase || lowercase)) {
			System.out.println("Error. Not a letter. Enter uppercase or lowercase letter.");
		} else if (vowels) {
			System.out.println("Input letter is Vowel");
		} else {
			System.out.println("Input letter is Consonant");
		}
	}
}
