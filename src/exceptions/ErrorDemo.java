package exceptions;



public class ErrorDemo {
	public static void main(String[] args) {
		try {
		run();
		}catch(StackOverflowError e) {
			System.out.println(e);
		}
	}
	
	public static void run() {
		System.out.println("Running....");
		run();
	}

}
