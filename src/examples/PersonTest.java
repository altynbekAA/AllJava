package examples;

public class PersonTest {
	
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.name = "Bob";
		p1.age = 25;
		int age1 = p1.getAge();
		System.out.println("person 1 age is "+age1 );
		
		int num = p1.get10();
		System.out.println("the result from get 10 is "+num );
		String simpleName = p1.getPersonName();
		System.out.println(simpleName);
		
		Person p2 = new Person();
		String name2 = p2.getPersonName();
		System.out.println(name2);
		
		
	}

}
