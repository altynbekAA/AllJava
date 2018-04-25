package abstraction;

public class LocalStudent extends Student {
	public static void main(String[] args) {
		
		
		//Student st1 = new Student();
		OnlineStudent o1 = new OnlineStudent();
		o1.attendClass();
	}

	@Override
	public void attendClass() {
      System.out.println("attending class localy");		
	}
    
}


