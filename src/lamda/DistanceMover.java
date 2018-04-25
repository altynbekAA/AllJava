package lamda;

public class DistanceMover implements Moveable {

	int a = 9; 
	
	@Override
	public void move(int i) {
		System.out.println("DistanceMover " + i);
		int a = 53;
		
	}

	public static  void main(String [] arg) {

		Moveable m = new  DistanceMover ();
		
		System.out.println(m.a);
		System.out.println(	((DistanceMover)m).a		);
	}

}
