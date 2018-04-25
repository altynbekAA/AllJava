package exampleclass;

import java.util.Scanner;

public class AgeTester {
   public static void main(String[] args) {
	   Scanner input = new Scanner(System.in);
	   
//	   System.out.println("age");
//	   int age = input.nextInt();
//	   
//	   if(age>=18) {
//		   System.out.println("adult");
//	   }else {
//		   System.out.println("not an adult");
//	   }
//	   // double equal == is cheking for equality
//	   if(age==18) {
//		   System.out.println("your are 18 years old");
//	   }
	      
	      
	   
	   // not equal !=
	   System.out.println("Name");
		String name = input.next();
		
		char firstLetter = name.charAt(0);
		if(firstLetter != 'A') {
			System.out.println("is not ");
		}else {
			System.out.println("it start with capital letter");
		}
			
	
}
}
