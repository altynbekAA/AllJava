package HomeTasks;

import java.util.Scanner;

public class FindElement {
	public static void main(String[] args) {

		
		String[] colors = {"Red", "Blue", "Black", "Green", "Orange", "Brown"};
		FindElementUtil call = new FindElementUtil();
		
		Scanner input = new Scanner(System.in);
		System.out.println("Type color");
		call.userWord = input.next(); 
		
		//int  a= call.getIndex(colors);
		System.out.println(call.getIndex(colors));
		


		
	}

}
