package exampleclass;

public class StringComparision {
	public static void main(String[] args) {
		String str1= "ABC";
		String str2= "ABC";
		String str3= new String ("ABCD");

		System.out.println(str1==str3);
		System.out.println(str1.equals(str3));
		
		if (str1.equals(str3)) 
			System.out.println("2not");
	        System.out.println("1not");
	}

}
