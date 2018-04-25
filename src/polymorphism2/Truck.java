package polymorphism2;

public class Truck extends Vehicle implements Def, Antifreez {

	@Override
	public void drive() {
		System.out.println("Truck is driving");
	}
	
	@Override
	public void stop() {
		System.out.println("Truck is stopping");
	}

	@Override
	public void cleanDef() {
		System.out.println("Cleaning truck");
		
	}

	@Override
	public void speedIng() {
		System.out.println("Speeding truck");
		
	}

	@Override
	public void antiFreez() {
      System.out.println("Antifreezing truck");		
	}
	
}
