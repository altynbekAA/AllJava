package interveiwTasks;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Junk {
	public static void main(String[] args) {
		int[] nums = new int[6];
		nums[0] = 50;
		nums[1] = 100;
		nums[2] = 100;
		nums[3] = 6;
		nums[4] = 7;
		nums[5] = 7;
		Set<Integer> set = new HashSet<>();
		for (int i = 0; i < nums.length; i++) {
		set.add(nums[i]);

		}
		System.out.println(set); //1
		
		
		String str = "dawdawdasdwdwdwd";
		Set<Character> set1 = new HashSet<>();
		for (int i = 0; i < str.length(); i++) {
		set1.add(str.charAt(i));
		}
		System.out.println(set1); //2
		
	
	
	List list = new ArrayList<>();
	for(int k = 0; k<str.length(); k++) {
		list.add(str.charAt(k));
	}
	System.out.println(list);


	
	
	
	}
	}


















