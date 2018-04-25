package ThenewBoston;

import java.util.Random;

public class apples26RandomNumber {
	public static void main(String[] args) {
		Random dice = new Random();
		int number;
		
		for(int counter =1; counter<=10; counter++) {
			number =dice.nextInt(6)+1;
			System.out.println(number +"  ");
		}
		
	}

}
