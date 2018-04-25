package polymorphism;

public class Boy extends Man {
	
	@Override
	public void eat() {
        System.out.println("Boy is eating");
	}
	
	public void cry() {
		System.out.println("Baby is crying");
	}

}
