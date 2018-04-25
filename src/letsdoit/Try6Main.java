package letsdoit;

public class Try6Main {
	public static void main(String[] args) {
		String[][] names = { {  "2" }, { "a", "b", "c", "s" },{"ad","as","ds" }};
		printElementsFor(names);
		printElementsForEach(names);

	}

	public static void printElementsFor(String[][] arr) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+" \t");
		}
        System.out.println();
	}
       


}
	
	public static void printElementsForEach(String [][] arr) {
		for(String [] word: arr) {
			for(String s: word) {
				System.out.print(s+"\t");
			}
			System.out.println();
		} 
		
	}
}









