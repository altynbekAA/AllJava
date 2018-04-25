package akbarInheritence;

public class Building {
     private String name;
     private String type;
     private int floorCount;
     private int doorCount;
     
//     public String toString() {
//    	   return 
//     }
     @Override
    public String toString() {
    	return "Building info: "+name+" "+type+" "+floorCount;
    }
     
 	public Building() {   	 
    }
    public Building(String name,String type,int floorCount) {
   	 this.name = name;
   	 this.type = type;
   	 this.floorCount = floorCount;
    }   
     public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getFloorCount() {
		return floorCount;
	}
	public void setFloorCount(int floorCount) {
		this.floorCount = floorCount;
	}	
	public int getDoorCount() {
		return doorCount;
	}
	public void setDooeCount(int doorCount) {
		this.doorCount = doorCount;
	}
     public void addFloor() {
    	    floorCount++;
    	    System.out.println("Floor count increased");
     }
     
     public void addDoor() {
    	     System.out.println("Door count increased");
     }
     
     
}
   






