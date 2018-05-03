package almaz;

public class Irina {
	public static void main(String[] args) {
		
		String str = "U2la7n";
		int a=0;
		for (int i = 0; i < str.length(); i++) {
			if(Character.isDigit(str.charAt(i))) {
				a+=Character.getNumericValue(str.charAt(i));
			}
			
			
		}
		System.out.println(a);
		
		
		
	}

}
