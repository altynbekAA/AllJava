package letsdoit;

import java.util.Scanner;

public class Try1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter first and second  number");
		int first = input.nextInt();
		int second = input.nextInt();

		System.out.println("even or odd?");
		String even = input.next();

		if (first < second) {
			for (int i = first; i < second; i++) {
				if (even.equalsIgnoreCase("odd")) {
					if (i % 2 != 0) {
						System.out.print(i+" ");
					}

				} else if (even.equalsIgnoreCase("even")) {
					if (i % 2 == 0) {

						System.out.print(i+" ");
					}
				}
			}
		} else if (second < first) {
			for (int a = first; a > second; a--) {
				if (even.equalsIgnoreCase("even")) {
					if (a % 2 == 0) {
						System.out.println(a);
					}
				} else if (even.equalsIgnoreCase("odd")) {
					if (a % 2 != 0) {
						System.out.println(a);
					}
				}
			}
		}
	}
}
