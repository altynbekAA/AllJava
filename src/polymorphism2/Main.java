package polymorphism2;

public class Main {
	public static void main(String[] args) {
		Car c = new Car();
		c.drive();
		c.stop();
		c.antiFreez();
		c.cleanDef();
		c.speedIng();
				
		Truck t = new Truck();
		t.drive();
		t.stop();
		
		Lexus l = new Lexus();
		l.drive();
		l.stop();
		
		System.out.println();
		
		Def d = new Truck();
		d.cleanDef();
		d.antiFreez();
		d.speedIng();
		
	}

}
