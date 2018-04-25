package akbarInheritence;

public class SingleHouse extends Building {
	
	double haoFee;
	
	public SingleHouse(String name, String type, int floorCount,double haoFee ) {
		super(name,type,floorCount);
//		super.setName(name);
//		super.setType(type);
//		super.setFloorCount(floorCount);
		this.haoFee = haoFee;
	}
	@Override
	public String toString() {		
	return super.toString()+haoFee+" | SingleHouse";
	}	
	 @Override
	 public void addDoor() {
		 System.out.println("adding door in single house");
	 }
	 @Override
	 public void addFloor() {
		 super.addFloor();
		 System.out.println("adding floor for single house");
	 }

	
}







