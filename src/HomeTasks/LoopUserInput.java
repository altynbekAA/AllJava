package HomeTasks;

import java.util.Scanner;

public class LoopUserInput {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String letter;
  do {
	  System.out.println("Enter one of this letters “Y” or  “y” or  “N” or  “n");
	  letter = input.nextLine();

  	}while(!letter.equals("y") && (!letter.equals("n") && (!letter.equals("Y") && (!letter.equals("N")))));
  System.out.println("Thank you dear you type "+letter);

}
}








