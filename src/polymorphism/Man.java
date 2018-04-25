package polymorphism;

public class Man extends Human implements Dad {

		
	@Override
	public void eat() {		
		System.out.println("Man is eating");
	}
	
	public void shave() {
		System.out.println("Man is shaving");
	}

	@Override
	public void feedFamily() {
      System.out.println("Dad is feeding the family");		
	}
	
	
}





