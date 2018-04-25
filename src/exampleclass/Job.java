package exampleclass;

public class Job {
   
	String title;
	int salary;
	String location;
	static boolean isRemote;
	
	public Job() {
		System.out.println("Getting a job");
	}
	
	public Job(String title, int salary) {
		this.title = title;
		this.salary = salary;
	}
	
	public Job(String title, int salary, String location) {
		this.title = title;
		this.salary = salary;
		this.location = location;
	}
	
	public void printJobDetail() {
		System.out.println("Title: "+title+"\n salary: "+salary+"\n location: "+location);
		System.out.println("Remote job: "+isRemote);
		System.out.println("----------------\n");
	}
}







