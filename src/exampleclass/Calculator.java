package exampleclass;
import java.util.Scanner;

public class Calculator {
	//int result;
  public static void main(String[] args) {
		//Scanner input= new Scanner(System.in);
		//int number = input.nextInt();
		//int num1;
		//int num2;
		//String operator;
		System.out.println("Please enter your first number: ");
		Scanner input= new Scanner(System.in);
		int num1=input.nextInt();
		
		System.out.println("Please enter second number");
		int num2=input.nextInt();
		
		System.out.println("Please enter operator");
		String operator=input.next();
		 int result;
		if(operator.equals("+")) {
			result=num1+num2;
			System.out.println(result);
				
			}else if(operator.equals("-")) {
				result=num1-num2;
				System.out.println(result);
				
			}else if(operator.equals("*")) {
				result=num1*num2;
				System.out.println(result);
					
			} else if(operator.equals("/")) {
				if(num2!=0) {
				result=num1/num2;
				System.out.println(result);
			
			} else  {
				System.out.println("Can't divide by 0! ");
			
			}
		
		
			
		
			

		

}
  }
}






