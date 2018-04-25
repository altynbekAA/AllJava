package TheNewBoston2;

public enum tunaSame {
     bucky("nice","22"),
	kelsey("cutie","10"),
	julia("bigmistake", "12");
	
	private final String desc;
	private final String year;
	
	tunaSame(String description, String birthday){
		desc = description;
		year = birthday;
	}
	
	public String getDesc() {
		return desc;
	}
	public String getYear() {
		return year;
	}

}
