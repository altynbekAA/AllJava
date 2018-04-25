package HomeTasks;
import java.util.Scanner;
     public class Rectangle {
	  public static void main (String[]args) {
		  Scanner input = new Scanner(System.in);
		  RectangleClass value = new RectangleClass();
		  
		  
		  System.out.println("input length");
		  double length = input.nextDouble();
		  
		  
		  System.out.println("input width");
		  double width = input.nextDouble();
		  
		  
		  double pp = value.perimeter(length,width);
		  double tt = value.area(length,width);
		  
		  System.out.println("perimeter "+Math.round(pp));
		  System.out.println("area "+Math.round(tt));
		  
		  
		  
		  
		  
		  
	
				  
	

	}

}
