package warmup;

import java.util.Scanner;

public class CheckIfPalindrome {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a word to check palindrome ");
		String name = scan.next();
		String reversed = "";
		for (int i = name.length() - 1; i >= 0; i--) {
			reversed+=name.charAt(i);
			//System.out.println(reversed);

		}
		if(reversed.equalsIgnoreCase(name)) {
			System.out.println("is palindrome");
		}else {
			System.out.println("in not palindrome");
		}

	}

}
