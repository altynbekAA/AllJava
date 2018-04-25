package HomeTasks;

import java.util.Scanner;

public class VendingMachineChange {
	     public static void main(String[] args) {
			Scanner input = new Scanner(System.in);

            System.out.println("Enter price in cents");
             int amount = input.nextInt();
             
             int exchange = 100-amount;
             
             int quarters = exchange/25;
             exchange = exchange%25;
             
             int dimes=exchange/10;
             exchange=exchange%10;
             
             int nickels=exchange/5;
             exchange=exchange%5;
             
                  //Your change is 0 quarters, 0 dimes, and 1 nickels.


             
             System.out.println("Your change is "+quarters+" quarters, "+dimes+" dimes, and "+nickels+" nickels.");
             
             
             
             
             
             
             
                
            
            
		}

}
