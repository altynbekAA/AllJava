package HomeTasks;

public class DivideBy3and5 {
	public static void main(String[] args)  {
		 int i=50;

		 while(i<100) {
			 
			 if(i%3==0 && i%5==0)
				 System.out.println("Number that can be divided by 3 and 5 without remainder: "+i);
			 
			 i++;
		 }
		 System.out.println("Out of the loop");


		 }

		

	}

