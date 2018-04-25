package warmup;

public class Investment {
	int amount ;
	double rate;
	int years;
	
	public double calculateInvestmentvalue(int amount, double rate, int years) {
		rate=rate/100;
		double interestAmount=amount*rate*years;
		double totalValue=interestAmount+amount;
		
		return totalValue;
		
		
		
		
		
	}
}






