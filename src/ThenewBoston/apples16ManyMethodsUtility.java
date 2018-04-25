package ThenewBoston;

public class apples16ManyMethodsUtility {
	private String girlName;

	
	public apples16ManyMethodsUtility(String name) {
		girlName = name;
	}
	
	public void setName(String name) {
		girlName=name;
	}
       public String getName() {
    	   return girlName;
       }
       public void saying() {
    	   System.out.println("Your first gf was "+ getName());
       }
       
}






