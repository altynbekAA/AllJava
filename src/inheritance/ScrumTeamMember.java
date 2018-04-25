package inheritance;

public class ScrumTeamMember {

	private String name;
	protected String position = "ScrumTeamMember";
	private int salary;
	protected String linkedInId;
	
	public static String company = "google";
	
	public static final String CITY;
	
	
	static {
		System.out.println("Static() constructor");
		System.out.println(company);
		CITY = "Silicon Valley";
	}
	{
		System.out.println("ScrumTeamMember() instance init block");
	}
	public ScrumTeamMember() {
		System.out.println("ScrumTeamMember() constructor");
	}
	public static void report() {
		System.out.println("Completed this sprint task");
	}

	public void work() {
		System.out.println(position+" is busy working");
	}
	public Object calculateSalary(int hours) {
		return hours * salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	

}
