package HomeTasks;

public class WaterBottle {
	private String brand;
	private boolean empty;
	
	public static void main(String[]args ) {
		WaterBottle wb = new WaterBottle();
		System.out.println("Empty = "+wb.empty);
		System.out.println("Brand = "+wb.brand);
		
		String java = " java hello ";
		int a = java.length();
		System.out.println(a);
		
		int b = java.trim().length();
		System.out.println(b);
	}

}
