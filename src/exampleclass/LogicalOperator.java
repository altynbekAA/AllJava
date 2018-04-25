package exampleclass;

import java.util.Scanner;

public class LogicalOperator {
	public static void main (String...args) {
		   Scanner input = new Scanner(System.in);
		   
		   System.out.println("What is your name");
		   String name = input.nextLine();
		   
		  boolean firstLetterA=name.startsWith("A");
		  boolean lastLetterC = name.endsWith("C");
		  if(firstLetterA && lastLetterC) {
			  System.out.println("Bingo");
		 
		  }else {
			  System.out.println("try another time");
		  }
		  
	}	
}
