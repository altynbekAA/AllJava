package exampleclass;

import java.util.Scanner;

public class Enisei {
	
	   public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		   System.out.println("any name");
		   String a = input.next();
		
		//boolean b = a.endsWith("k");
		boolean c = a.startsWith("S");
		//System.out.println(b);
		System.out.println(c);
		
		int d = a.length();
		System.out.println(d);
		
		char e = a.charAt(3);
		System.out.println(e);
		
		String f = a.toLowerCase();
		System.out.println(f);
		
		String j = a.toUpperCase();
		System.out.println(j);
		
		
		if(a.endsWith("s")) {
			System.out.println("This is right");
		}else {
			System.out.println("false");
		}
	}

}
