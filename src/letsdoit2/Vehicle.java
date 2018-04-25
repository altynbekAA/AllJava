package letsdoit2;

public class Vehicle {
	String model;
	int year;
	String color;
	
	public Vehicle() {			
	}	
	
	public Vehicle(String model) {
		this.model = model;
	}
   
	public Vehicle(String model, int year, String color) {
    	  this.model = model;
    	  this.year = year;
    	  this.color = color;
    }
	
	public String getModel() {
		return model;
	}
	
	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	
	
	
}




