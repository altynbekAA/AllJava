package polymorphism2;

public class Car extends Vehicle implements Def {
	
    @Override
    public void drive() {
    	System.out.println("Car is driving");
    }
    
    @Override
    public void stop() {
    	System.out.println("Car is stopping");
    }

	@Override
	public void antiFreez() {
        System.out.println("Antifreezing car");		
	}

	@Override
	public void cleanDef() {
       System.out.println("Cleaning car");		
	}

	@Override
	public void speedIng() {
		System.out.println("Speeding car");
		
	}
}
