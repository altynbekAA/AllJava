package lamda;

public abstract interface Moveable {

	public  void move(int i);
	
	int a = 6;
	
	public static void move() {
		System.out.println("Hello from Moveable");
	}
	
	 default int move(String str) {
		System.out.println("Hello frome ");
		return 2;
	}
	 
	 
	 
	 
	 
	
}



