package exampleclass;

public class WhileSleep {
	public static void main(String[] args) throws InterruptedException {
		
		int numbers = 0;
		while (numbers <= 16) {
			System.out.print(numbers+",");
			Thread.sleep(1000);
			//++numbers;
	}

}
}