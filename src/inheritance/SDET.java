package inheritance;

public class SDET extends ScrumTeamMember {

	protected String position = "Java SDET"; 
	
	@Override
	public void work() {
		System.out.println(position + " Developing Test Automation Code");
	}
	
	public String calculateSalary(int hours, double bonus) {
		return ""+(hours * getSalary());
	}
	static {
		System.out.println("Static() constructor");
	}
	{
		System.out.println("SDET() instance init block");
	}
	public SDET() {
		super();
		System.out.println("SDET() constructor");
	}
	public static void report() {
		System.out.println("SDET this sprint task");
	}

}
