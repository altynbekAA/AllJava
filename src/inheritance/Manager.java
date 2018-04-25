package inheritance;

public class Manager extends ScrumTeamMember {

	protected String position = "Manager"; 
	
	@Override
	public void work() {
		System.out.println(position+" supporting the Team");
	}

}
