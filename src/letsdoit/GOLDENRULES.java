package letsdoit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GOLDENRULES {

	public static void main(String[] args) {
		
		int [] so1 = {2,7,1,4,12};
		Arrays.sort(so1);
		for(int so: so1) {                    //Arrays.binarySearch
			 							      //Arrays.sort
			//System.out.print(so);
		}
		System.out.println();
		int [] so2 = {2,7,1,4,12};
		//System.out.println(Arrays.binarySearch(so1, 4));

		
		

		// CheckWithEsen c1 = new CheckWithEsen();         // Constructor;

		StringBuilder sb = new StringBuilder(" Altynbek ");
//		System.out.println(sb);                            // Altynbek
//		System.out.println(sb.append(" SDET "));           // Altynbek SDET
//		System.out.println(sb.length());                   // 13
//		System.out.println(sb.append(12));                 // Altynbek SDET 12
//		System.out.println(sb.delete(8, sb.length() - 1)); // Altynbe2
//		System.out.println(sb.insert(2, "P"));             // APltynbe2

		String ss1 = "12";
		int in1 = Integer.parseInt(ss1);
		int in2 = Integer.valueOf(ss1);
	
//		System.out.println(in1); // 12
//		System.out.println(in2); // 12
//		System.out.println("---------------------------------------------");
//		System.out.println(Boolean.parseBoolean("true"));   //true Converting String to primitive  
//		System.out.println(Boolean.valueOf(true));          //true Converting String to wrapper class
//		System.out.println("-----------------------------------------------");
		
		
		

		ArrayList l = new ArrayList(10);           // ArrayList;
		ArrayList l1 = new ArrayList();

		ArrayList<Integer> i1 = new ArrayList<Integer>(); // Type Wrapper class Short, Integer, Double
		ArrayList<Integer> i2 = new ArrayList<>();
		List<Integer> i3 = new ArrayList<>();
//		System.out.println(i1.add(2));            // true
//		System.out.println(i1.size());            // 1
//		System.out.println(i1.isEmpty());         // false
//		System.out.println(i1.contains("2"));     // false
		
		
		
		 //Multi-Dimentional Arrays
		int [][] groupsDucks = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
		//System.out.println(groupsDucks[0][2]);  //3
		//System.out.println(groupsDucks[2][2]);  //9
		//System.out.println(groupsDucks[3][0]);  //10
		for(int i =0; i<groupsDucks.length; i++) {
			for(int j=0; j<groupsDucks[i].length; j++) {
			//System.out.println(groupsDucks[i][j]);  //1,2,3,4,5,6,7,8,9,10,11,12
		}
		}
		
		int [][][] groupsDucks1 = {{{1,2,3},{4,5,6},{7,8,9},{10,11,12},{13,14,15}}};
		//System.out.println(groupsDucks1[0][1][2]);  //6
		//System.out.println(groupsDucks1[0][4][2]);  //15
																		       //||\\
		int [][][] groupsDucks2 = {{{1,2,3},{4,5,6},{7,8,9},{10,11,12},{13,14,15}},{{1,2,3},{4,5,6},{7,8,9},{10,11,12},{13,14,15}}};
        //System.out.println(groupsDucks2[1][2][2]);   //9
		
        
        
        int 	[][] array = new int[2][3];      //same 
        int [] array1 [] = new int [2][3];   //same
        int array2 [][] = new int [2][3];    //SAME **
        array2 [0][0] = 11;
        array2 [0][1] = 12;
        array2 [0][2] = 13;
        array2 [1][0] = 14;
        array2 [1][1] = 15;
        array2 [1][2] = 16;
        
        int [][] array3 = new int [2][3];    //SAME ** 
        array3 [0] = new int []{11,12,13};
        array3 [1] = new int [] {14,15,16};
        
        int [][]arr3 = new int [2][];         //Same second square bracket size is optional
        arr3 [0] = new int [] {1,2,3,4,5};
        arr3 [1] = new int [] {6,7,8,9,10};
        
        for(int []row: arr3) {
        	for(int colum: row) {
        		//System.out.println(colum);       //1,2,3,4,5,6,7,8,9,10
        	}
        }
        
        
        
	}

}








