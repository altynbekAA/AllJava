package HomeTasks;

import java.util.Scanner;

public class VoteElegibility {
         public static void main(String[] args) {
        	 Scanner input = new Scanner(System.in);
        	 
        	System.out.println("Enter your age");
        	 int age = input.nextInt();
        	 
        	 if(age>=18) {
        System.out.println("You are eligible to vote");
        		 }else {
        	System.out.println("Sorry: you are not eligible to vote");
        			 
        			 
        		 
        	 }
	
}
}
