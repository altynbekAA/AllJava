package exceptions;

public class CheckedVsUnchecked {
	public static void main(String[] args) {
		try {
		Thread.sleep(2000);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		
	
	}
	
}






