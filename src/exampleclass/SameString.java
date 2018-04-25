package exampleclass;
import java.util.Arrays;
public class SameString {
	public static void main(String[] args) {
		String [] students =  {"Altynbek","Azizbek", "Kanybek","Ibragim"};                //1
		
		String students1[]= new String[4];                                                //2
		students1[0]="Altynbek"; 
		students1[1]="Azizbek";
		students1[2]="Kanybek";
		students1[3]="Ibragim";
		
		String [] students2 = new String [] {"Altynbek","Azizbek", "Kanybek","Ibragim"};  //3
		
		
		//=======================================================
		
		int [] age, number;
		age = new int [5];
		number = new int[10];
		
		//sort() method is 
		String []names= {"rali","james","aon"};
		for(String s: names) {
			System.out.print(s+" ");
		}
		System.out.println();
		
		
		
		Arrays.sort(names);
		for(String t: names) {
			System.out.print(t+" ");
		}
		
		
		
		
		
		
		
		
		
	}

}
