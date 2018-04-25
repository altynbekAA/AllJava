package lamda;

public class MainInterface {
	public static void main(String[] args) {
		
		char as = 'a';
		System.out.println(++as);
		System.out.println(++as);

		// Moveable d = new DistanceMover();
		// d.move(0);
		//
		// Moveable d2 = new DistanceMovable2();
		// d2.move(2);
		//
		// Moveable d3 = new DistanceMovable3();
		// d3.move(3);

		Moveable d4 = new Moveable() {

			@Override
			public void move(int i)  {
            System.out.println("Distance Mover "+i);
			}
		};
		
		
		
		Moveable m5 = (int distance) -> {System.out.println("Moving "+distance+" mile");};
		System.out.println(m5);

}
}



