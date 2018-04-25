package ThenewBoston;

import java.util.Scanner;

public class apples16ManyMethods {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		apples16ManyMethodsUtility tuna = new apples16ManyMethodsUtility("Kelsey");
		System.out.println(" Enter name first gf here: ");
		String temp = input.nextLine();
		
		tuna.setName(temp);
		tuna.saying();
		
		

	}

}
