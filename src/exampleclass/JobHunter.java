package exampleclass;

public class JobHunter {
	public static void main(String[] args) {
		
		Job j1 = new Job();		
		Job j2 = new Job("SDET",55);		
		Job j3 = new Job("SDET",55,"Chicago");
		
		
		j1.printJobDetail();
		j2.printJobDetail();
		j3.printJobDetail();
		
		j2.isRemote = true;
		
		j1.printJobDetail();
		j2.printJobDetail();
		j3.printJobDetail();
	}

}
