package ThenewBoston;

import java.util.Scanner;

public class apples15MethodswithParameters {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		apples15MethodswithParametersUtility tuna = new apples15MethodswithParametersUtility();
		
		System.out.println("Enter your name here: ");
		String name = input.nextLine();
		
		tuna.simpleMessage(name);
		
		
		
	}

}
