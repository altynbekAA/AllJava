package exampleclass;
import java.util.Scanner;

public class Driving {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("input number of miles");
		float miles =input.nextFloat();
		
		System.out.println("what the mph? ");
		float speed = input.nextFloat();
		
		float time = miles/speed;
		float minutes = miles/speed*60;
		System.out.println("Total time to reach destination "+time);
		System.out.println("Total time to reach destination "+minutes);
		
	}

}
