package abstraction;

public interface FlashCard1 extends FaceRecogntion1 {
    int memory =256;
    public static final int size = 5;
	
    void flashcardLocation();
	public abstract void capacityInfo();
	
	static void staticMEthod() {
	System.out.println("static method inside the interface");	
	}
	default void defaultMethod() {
		System.out.println("default method inside the interface");
	}
}


