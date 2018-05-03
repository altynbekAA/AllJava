package interveiwTasks;

public class Fibonacci {
	
	public static void main(String[] args) {
		
		//1 1 2 3 5 8 13 21 34 
		
		int zero = 0;
		int one = 1;
		int sum = 0;
		for (int i = 0; i < 10; i++) {
			
			sum=zero+one;
			zero=one;			
			one=sum;
			
			System.out.print(sum+" ");
			
		}
		//2 3 5 8 13 21 34 55 89 144
		//1 1 2 3 5 8 13 21 34 55
	
		
	}

}
