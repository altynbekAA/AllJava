package exampleclass;

public class Tip {

	String poor, fair, good, great, exellent;

	double checkAmount, tip, totalPerPerson, TipPerPerson, totalPay;;

	public void calculateBill(int numberOfPeople, double checkAmount, String qualityOfService, String yesno) {

		switch (qualityOfService) {
		case "poor":
			tip = checkAmount * 0.05;
			totalPay = checkAmount + tip;
			totalPerPerson = (tip + checkAmount) / numberOfPeople;
			TipPerPerson = tip / numberOfPeople;

			System.out.println("Total to pay " + totalPay);
			System.out.println("Total tip " + tip);
			if (yesno.equalsIgnoreCase("yes")) {
				System.out.println("Total per person " + totalPerPerson);
			    System.out.println("Tip per person " + TipPerPerson);
		   }
			break;

		case "fair":
			tip = checkAmount * 0.10;
			totalPay = checkAmount + tip;
			totalPerPerson = (tip + checkAmount) / numberOfPeople;
			TipPerPerson = tip / numberOfPeople;
			System.out.println("Total to pay " + totalPay);
			System.out.println("total tip " + tip);
			if (yesno.equalsIgnoreCase("yes")) {

			System.out.println(" totalPerPerson " + totalPerPerson);
			System.out.println("Tip per person " + TipPerPerson);
			}
			break;

		case "good":
			tip = checkAmount * 0.15;
			totalPay = checkAmount + tip;
			totalPerPerson = (tip + checkAmount) / numberOfPeople;
			TipPerPerson = tip / numberOfPeople;
			System.out.println("Total to pay " + totalPay);
			System.out.println("total tip " + tip);
			if (yesno.equalsIgnoreCase("yes")) {

			System.out.println(" totalPerPerson " + totalPerPerson);
			System.out.println("Tip per person " + TipPerPerson);
			}
			break;
		case "great":
			tip = checkAmount * 0.20;
			totalPay = checkAmount + tip;
			totalPerPerson = (tip + checkAmount) / numberOfPeople;
			TipPerPerson = tip / numberOfPeople;
			System.out.println("Total to pay " + totalPay);
			System.out.println("total tip " + tip);
			if (yesno.equalsIgnoreCase("yes")) {

			System.out.println(" totalPerPerson " + totalPerPerson);
			System.out.println("Tip per person " + TipPerPerson);
			}
			break;
		case "exellent":
			tip = checkAmount * 0.25;
			totalPay = checkAmount + tip;
			totalPerPerson = (tip + checkAmount) / numberOfPeople;
			TipPerPerson = tip / numberOfPeople;
			System.out.println("Total to pay " + totalPay);
			System.out.println("total tip " + tip);
			if (yesno.equalsIgnoreCase("yes")) {

			System.out.println("totalPerPerson " + totalPerPerson);
			System.out.println("Tip per person " + TipPerPerson);
			}
			break;
		default:
			System.out.println("Please try again");
		}

	}

	{

	}
}
