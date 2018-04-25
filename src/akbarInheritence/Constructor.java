package akbarInheritence;

public class Constructor {
	public static void main(String[] args) {
		
		
		Building b1 = new Building("Trump Tower", "Hotel", 5);
		System.out.println(b1);
		
		SingleHouse s1 = new SingleHouse("MyHouse","Single",3,99.9);
		System.out.println(s1);
		
		s1.addDoor();
		s1.addFloor();
		
	}

}





