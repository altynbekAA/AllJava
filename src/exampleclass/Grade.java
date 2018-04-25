package exampleclass;

import java.util.Scanner;

public class Grade {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	
		
		
		    System.out.println("Grade");
		    int myGrade = input.nextInt();
		
		    if(myGrade>=95 && myGrade<=100) {
			System.out.println("A+ "+myGrade);
			
			}else if(myGrade<95 && myGrade>=88) {
			System.out.println("A "+myGrade);
			
			}else if(myGrade<88 && myGrade>=80) {
			System.out.println("B "+myGrade);
			
		    }else if(myGrade<80 && myGrade>=75) {
			System.out.println("C "+myGrade);
			
		    }else if(myGrade<75)
			System.out.println("fail "+myGrade);
		} 
	}


