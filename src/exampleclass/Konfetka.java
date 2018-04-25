package exampleclass;

import java.util.Scanner;

public class Konfetka {
   public static void main(String[] args) {
	   Scanner input = new Scanner(System.in);
	   
	   System.out.println("First name");
	   String first = input.next();
	   
	   System.out.println("Last name");
	   String last = input.next();
	   
	   System.out.println("Age");
	   int age = input.nextInt();
	   
	   
	   if(age<=10) {
		   System.out.println("Candy for you "+first+" "+last+" "+age+" age");
	   }else if(age>11 && age<=20) {
		   System.out.println("Money for you "+first+" "+last+" "+age+" age");
	   }else if(age>20 && age<=30) {
		   System.out.println("Job for you "+first+" "+last+" "+age+" age");
	   }else if(age>30 && age<=40) {
		   System.out.println("Sleep time for you "+first+" "+last+" "+age+" age");	
	   }else if (age>40)
		   System.out.println("You retired "+first+" "+last+" "+age+" age");
	   }
	   
	   
   
	
}

