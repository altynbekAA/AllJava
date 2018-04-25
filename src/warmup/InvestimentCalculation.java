package warmup;

import java.util.Scanner;

public class InvestimentCalculation {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter IInvestment Amount");
		int investmentAmount = input.nextInt();
		
		System.out.println("Enter of rate");
		double interestRate = input.nextDouble();
		
		System.out.println("Enter number of years");
		int numberOFYears=input.nextInt();
		
		//1
		/*interestRate = interestRate/100;
		System.out.println("Interes rate: "+interestRate);
		
		double interestAmount=investmentAmount*interestRate*numberOFYears;
		double totalValue = interestAmount+investmentAmount;
		
		System.out.println("Investment value for "+numberOFYears+" years "+totalValue);
		*/
		
		//2
		Investment investment = new Investment();
		double totalInvestmentValue=investment.calculateInvestmentvalue(investmentAmount, interestRate, numberOFYears);
		System.out.println("Investment value after "+numberOFYears+" years "+totalInvestmentValue);
		
		
		
		
	}

}
