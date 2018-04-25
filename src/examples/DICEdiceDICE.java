package examples;
import java.util.Random;
public class DICEdiceDICE {
	public static void main(String[] args) {
		
		Random dice = new Random();
		int firstPlayer, secondPlayer;
		for(int index = 1; index<=1; index++) {
			firstPlayer = 1+dice.nextInt(6);
           System.out.println("First  player dice number: --> "+ firstPlayer);
           secondPlayer = 1+dice.nextInt(6);
           System.out.println("Second player dice number: --> "+secondPlayer);
           if(firstPlayer>secondPlayer) {
        	   System.out.println("First player won");
           }else if(firstPlayer==secondPlayer){
        	   System.out.println("Roll the dice again");
           }else {
        	   System.out.println("Second player won");
           }
		}
		
		
		
		
	}
	
	

}
