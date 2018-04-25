package exceptions;

public class RunTimeExceptions {
	public static void main(String[] args) {
		try {
			String[] str = { "one", "Two", "Three" };
			System.out.println(str[3]);
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		
		}
	
		try {
		String a = "Apples";
		char s  = a.charAt(10);
		System.out.println(s);
		}catch(StringIndexOutOfBoundsException s) {
			System.out.println(s);
		}
		
		try {
		int n = 100;
		int w = 100/0;
		System.out.println(w);
		}catch (ArithmeticException t) {
			System.out.println(t);
		}
		
		try {
		String name = null;
		System.out.println(name.length());
		}catch (NullPointerException e) {
			System.out.println(e);
		}
	}
	
	

}
