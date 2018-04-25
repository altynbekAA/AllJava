package examples;


public class HowtoUSEstrMethods {
	public static void main(String[] args) {
		        //index  012345678
		String myName = "Altynbek ";
		       //length  123456789
		String empty = "";
		                                                           //output
        System.out.println(myName.charAt(0));        //index            A         char
        System.out.println(myName.codePointAt(0));   //code            65         int 
        System.out.println(myName.concat("good"));   // connect        good       String 
        System.out.println(myName.contains("A"));     // A              true      boolean
        
        System.out.println(myName.endsWith(" "));     //space          true       boolean
        System.out.println(myName.startsWith("l"));   //               false
        System.out.println(myName.indexOf("k"));     //String           7         int 
        System.out.println(myName.indexOf('t'));      //char            2         int 
        
        System.out.println(myName.trim());            //              Altynbek    String 
        System.out.println(myName.lastIndexOf("A"));  //A               0         int
        System.out.println(myName.length());          //letters         9          int 
        System.out.println(myName.replaceAll("Altynbek", "Dina")); //  Dina       String 
        
        System.out.println(myName.replace("A", "V"));  //change        Vltynbek   String
        System.out.println(myName.toUpperCase());      //             ALTYNBEK    String 
        System.out.println(myName.toLowerCase());      //             altynbek    String
        System.out.println(myName.substring(5, 8));   //between        bek        String
        System.out.println(myName.substring(1));      //              ltynbek     String
       
        System.out.println(empty.isEmpty());          //emty           true       boolean
        
	
	
	
	
	
	}
	
	
	
	
}
	
     








	
	
	
	
	
	
	
	
