package exampleclass;

public class TernaryOperator {
	public static void main(String[] args) {
		//int number=1;
		
		
//		if(number>0) {
//			System.out.println("positive");
//		}else {
//			System.out.println("negativie");
//		}
		//System.out.println((number>0) ?"positive": "negativie");
		
		String drink="hot";
		if(drink.equals("cold")) {
			System.out.println("You selected cold drink");
		} else {
			System.out.println("You selected hot drink");
		}
		String drinkSelection=((drink.equals("cold"))? "You selected cold drink":"You selected hot drink");
		System.out.println(drinkSelection);
		
		
		
		
	}

}
