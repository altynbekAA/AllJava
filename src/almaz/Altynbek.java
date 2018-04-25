package almaz;

public class Altynbek {
	String name;
	int number;
	
 public Altynbek() {      //1
	
 }
	
	public Altynbek(int number, String name) {    //2
		this.name = name;
		this.number = number;
		System.out.println(name);
		System.out.println(number);
	}
	
	
	public static void java(int i) {						//3
		System.out.println("java method");
	}
	
	public static int kee() {					//4
		return 5;
	}

	
	
}
