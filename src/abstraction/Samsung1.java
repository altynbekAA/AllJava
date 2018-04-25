package abstraction;

public class Samsung1 extends Phone1 implements FlashCard1, FaceRecogntion1 {

	@Override
	public void call() {
		// TODO Auto-generated method stub
		System.out.println("Samsung calling");
	}

	@Override
	public void lockScreen() {
		// TODO Auto-generated method stub
		System.out.println("Samsung lock");

	}

	@Override
	public void texting() {
		// TODO Auto-generated method stub
		System.out.println("Samsung texting");

	}

	@Override
	public void takePicture() {
		// TODO Auto-generated method stub
		System.out.println("Samsung takeing picture");

	}

	@Override
	public void call(String number) {
		// TODO Auto-generated method stub
		System.out.println("Samsung is calling to: "+number);

	}

	@Override
	public void flashcardLocation() {
		// TODO Auto-generated method stub
		System.out.println("ok i am");
	}

	@Override
	public void capacityInfo() {
		// TODO Auto-generated method stub
		System.out.println("it is about 1 mb");
	}

	@Override
	public void raceID() {
		// TODO Auto-generated method stub
		
	}

}
