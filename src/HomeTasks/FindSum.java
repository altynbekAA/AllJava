package HomeTasks;

import java.util.Scanner;

public class FindSum {
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		System.out.println("give total");
		
		Array sum = new Array();

		int total[]= {20,13,7,2,1,1,4,7,2,9,11,23};
		int checkinNum= input.nextInt();

		System.out.println(sum.getNum(total, checkinNum));

		
	}

}

  class Array{
	public String getNum(int []array, int num) {
		String result="";
		
		for(int i=0; i<array.length; i++) {
			for(int f=0; f<array.length; f++) {
				if(array[f]+array[i]==num) {
					result = "Indexes are: "+f+","+i;
				}
			}
		}
		return result;
	}
}
