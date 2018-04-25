package HomeTasks;

public class LooPattern {
	public static void main(String[] args) {
		String dot = ".";
		int number = 5;
		for(int i = 1; i<=number; i++) {
			for(int k=0; k<number-i; k++) {
				System.out.print(dot);
			}
			System.out.println(i);
		}
	}

}
//....1 
//
//...2 
//
//..3 
//
//.4 
//
//5 