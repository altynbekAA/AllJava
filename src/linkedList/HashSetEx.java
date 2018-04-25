package linkedList;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetEx {
	public static void main(String[] args) {
		
		//Set only allows unique elements
		//does not keep ordering
		Set<Integer> uniqueNums = new HashSet<>();
		uniqueNums.add(123);
		uniqueNums.add(234);
		uniqueNums.add(654);
		uniqueNums.add(654);

		
		System.out.println(uniqueNums);

		List<String> l =  Arrays.asList("one","two","three","three", "four", "ten", "ten");
		System.out.println(l);
		
		Set<String> set = new HashSet<>(l); 
		System.out.println(set);
		
		for (String string : set) {
			System.out.println(string.toLowerCase());
		}
		
	
		
		
	}
}













