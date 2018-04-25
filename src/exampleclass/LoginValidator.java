package exampleclass;

import java.util.Scanner;
//import java.util.concurrent.SynchronousQueue;

public class LoginValidator {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String login = "Golden";
		String code = "cyber";

		System.out.println("Enter your user name");
		String user = input.next();

		System.out.println("Enter your password");
		String pass = input.next();

		// short way
		if (user.equals(login) || pass.equals(pass)) {
			System.out.println("You enter your name and password sucssesfull");
			// second way
			// }else if(pass==code) {
			// System.out.println("You enter your name and password sucsseufull");

		} else  {
			if (user.isEmpty() && pass.isEmpty()) {
				if (user.isEmpty()) {
					System.out.println("User name cannot be blank");

				}
				if (pass.isEmpty()) {
					System.out.println("Password cannot be blank");
				}

			} else if (!user.equals(login)) {
				System.out.println("Invalid username");
		}
		
		if (!pass.equals(code)) {
			System.out.println("Invalid password");
		}
	}
	}
}
