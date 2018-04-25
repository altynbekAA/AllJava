package exampleclass;
import java.util.Scanner;
public class DogFoodCalculator {
	public static void main (String [] args){
		Scanner input = new Scanner(System.in);

		System.out.println("Input for number of dogs");
		int numberOfDogs = input.nextInt();

		System.out.println("Input for number of days");
		int numberOfDays = input.nextInt();

		double wetFoodPerDay = 2;
		double veggies = 2;
		double dryFoodPerDay = 1;
		double totalWetFood = numberOfDogs*wetFoodPerDay;
		double totalDryFood = numberOfDogs*dryFoodPerDay;
		double totalVeggie = wetFoodPerDay*veggies;
        System.out.println("Wet food for average dog per day = " +Math.round(totalWetFood));
		System.out.println("Dry food for average dog per day = " +Math.round(totalDryFood));
		System.out.println("Veggies for average dog per day = " +Math.round(totalVeggie));














	}
}


