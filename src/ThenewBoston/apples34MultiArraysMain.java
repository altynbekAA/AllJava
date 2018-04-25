package ThenewBoston;
import java.util.*;
public class apples34MultiArraysMain {
	public static void main(String[] args) {
		int firstarray [][] = {{8,9,10,11},{12,13,14,15}};
		int secondarray [][]= {{30,31,32,33},{43},{4,5,6}};
		
		apples36TimeClass tuna36 = new apples36TimeClass();
		
		//System.out.println("This is the first array");
		//display(firstarray);
		
		//System.out.println("This is second array");
		//display(secondarray);
		
		//System.out.println(tuna.toMilitary());
		tuna36.setTime(13, 26, 6);
		//System.out.println(tuna.toMilitary());
		tuna36.setTime(13, 26, 6);
		//System.out.println(tuna.toString());
		
		apples39MultipleConstructors tuna1 = new apples39MultipleConstructors();
		apples39MultipleConstructors tuna2 = new apples39MultipleConstructors(5);
		apples39MultipleConstructors tuna3 = new apples39MultipleConstructors(5,13);
		apples39MultipleConstructors tuna4 = new apples39MultipleConstructors(5,13,43);

		System.out.printf("%s\n", tuna1.toMilitary());
		System.out.printf("%s\n", tuna2.toMilitary());
		System.out.printf("%s\n", tuna3.toMilitary());
		System.out.printf("%s\n", tuna4.toMilitary());


		
	     
		
		
	
	
	
	
	
	
	
	}
	public static void display(int x[][]) {
		for(int row=0; row<x.length; row++) {
			for(int column=0; column<x[row].length; column++) {
				System.out.print(x[row][column]+"\t");
			}
			System.out.println();
		}
	}

}
