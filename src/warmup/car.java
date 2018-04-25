package warmup;

public class car {
	String model;
	int currentSpeed;
	String color;

	public void printCarInformation() {
		System.out.println(color + " " + model + " " + "is driving " + currentSpeed + " mph");
	}

	public void accelearte(int moreSpeed) {
		currentSpeed = currentSpeed + moreSpeed;
		System.out.println("My currentSpeed "+currentSpeed);

	}
	
	public int getCurrentSpeed() {
		return currentSpeed;
	}
	


	}





