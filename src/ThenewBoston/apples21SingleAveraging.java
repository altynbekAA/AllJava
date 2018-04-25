package ThenewBoston;

import java.util.Scanner;

public class apples21SingleAveraging {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int total=0;
		int grade;
		int average;
		int counter =0;
		
		while(counter<10) {
			grade = scan.nextInt();
			total = total+grade;
			counter++;
		}
		average=total/10;
		System.out.println("Your average is "+average);
		
		

	}

}
