package letsdoit;

import java.util.Arrays;

public class Try7 {

	/**
	 * Tasks are created and solved by
	 * 
	 * @AlmazbekBegaliev
	 */

	/**
	 * Convert given string to array of char without spaces and tabs then return
	 * that array.
	 */
	// GOLDEN
	public char[] getArray(String str) {
		str = str.trim();
		char[] result = new char[str.length()];
		for (int i = 0; i < str.length(); i++) {
			result[i] = str.charAt(i);

		}

		return result;
	}

	/**
	 * return middle two char of string if it is length is even, middle one if it is
	 * odd.
	 */

	public String getMidleTwo(String str) {
		String mid = "";
		if (str.length() % 2 == 0) {
			mid = str.substring(str.length() / 2 - 1, str.length() / 2 + 1);
			return mid;

		} else if (str.length() % 2 == 1) {
			mid = str.substring(str.length() / 2, str.length() / 2 + 1);
		}

		return mid;
	}

	/**
	 * return true, if given string contains 'a' or 'A' and 'e' or 'E' in given
	 * string; return false otherwise
	 * 
	 * @param str
	 * @return
	 */

	public boolean checkForChar(String str) {
		if (str.contains("a") || str.contains("A") || str.contains("e") || str.contains("E")) {
			return true;
		}

		// TO DO

		return false;
	}

	/**
	 * replace middle char of string with a given char return changed string
	 * 
	 * @param word
	 * @param ab
	 * @return
	 */
	public String changeMiddleChar(String word, char ab) {
		String mid = "";
		String b = "";
		if (word.length() % 2 == 0) {
			mid = word.substring((word.length() / 2 - 1), (word.length() / 2 + 1));
			String a = word.replace(mid, "" + ab);
			return word;
		}
		if (word.length() % 2 == 1) {
			mid = word.substring((word.length() / 2), (word.length() / 2 + 1));
			b = word.replace(mid, "" + ab);

			return b;
		}

		return b;

	}

	/**
	 * check if given char is vowel or not return true if it is vowel, false
	 * otherwise
	 * 
	 * @param ch
	 * @return
	 */

	public boolean isVowel(char ch) {

		if (ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'o' || ch == 'O' || ch == 'u' || ch == 'U'
				|| ch == 'i' || ch == 'I') {
			return true;
		}
		// TO DO

		return false;
	}

	/**
	 * return true if there is a sequence of 3 vowels or consonant char in the given
	 * String.
	 */

	public boolean getSequenceOf3Char(String str) {
		// TO DO

		for (int i = 0; i < str.length(); i++) {
			if (isVowel(str.charAt(i)) && isVowel(str.charAt(i + 1)) && isVowel(str.charAt(i + 2))) {
				return true;
			} else if (!isVowel(str.charAt(i)) && !isVowel(str.charAt(i + 1)) && !isVowel(str.charAt(i + 2))) {
				return true;
			} else {
				return false;
			}
		}
		return false;

	}
}
