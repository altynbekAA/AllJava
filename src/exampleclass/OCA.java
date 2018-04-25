package exampleclass;

import java.util.Scanner;

public class OCA {
    	 public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			
			System.out.println("What is your grade");
			int myGrade = input.nextInt() ;
			char grade ; 
			
			if(myGrade>=90) {
				grade = 'A' ; 
			}else if(myGrade<90 && myGrade>=80) {
				 grade ='B';
			}else if(myGrade<80 && myGrade>=70) {
				grade = 'C';
			}else if(myGrade<70 && myGrade>=65) {
			     grade ='D';
			} else 
				grade = 'F';
				
				System.out.println("my grdae "+grade);
			}
				
			
		}
	
	


