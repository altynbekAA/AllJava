package abstraction;

import java.util.List;

public class Iphone1 extends Phone1 implements FlashCard1, FaceRecogntion1 {
	

	@Override
	public void call() {
		// TODO Auto-generated method stub
		System.out.println("Iphone is calling");
	}

	@Override
	public void lockScreen() {
		// TODO Auto-generated method stub
		System.out.println("Iphone is texting with iMessage");
	}

	@Override
	public void texting() {
		// TODO Auto-generated method stub
		System.out.println("Iphone taking awesome picture");
	}

	@Override
	public void takePicture() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void call(String number) {
		// TODO Auto-generated method stub
		System.out.println("Iphone is calling to: "+number);
	}

	@Override
	public void flashcardLocation() {
		// TODO Auto-generated method stub
		System.out.println("i am ok ");
	}

	@Override
	public void capacityInfo() {
		// TODO Auto-generated method stub
		System.out.println("its about 1mb");
	}

	@Override
	public void raceID() {
		// TODO Auto-generated method stub
		
	}

}
