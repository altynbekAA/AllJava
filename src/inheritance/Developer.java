package inheritance;

public class Developer extends ScrumTeamMember {
    
	protected String position = "Java Developers"; 
	
	@Override
	public void work() {
		System.out.println(position+" Developing Application");
	}
	
//	@Override
//	public Integer calculateSalary(int hours) {
//		return hours * getSalary();
//	}
	
	public static void report() {
		System.out.println("Completed this sprint task");
	}

}




