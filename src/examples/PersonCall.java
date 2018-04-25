package examples;


public class PersonCall {
	public static void main(String[] args) {
		   Person java = new Person();
		   String al=java.name="Altynbek ";
		   java.age=25;
		   int getAge =java.getAge();
		   System.out.println(al+getAge+" years old");
		   
		   int get =java.get10();
		   
		   //String altyn = java.getPersonName();
		   System.out.println(java.getPersonName());
		   
		   System.out.println(java.getName());
		    
		    
		    
		    
	}

}
