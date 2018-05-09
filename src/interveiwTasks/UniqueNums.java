package interveiwTasks;

import java.util.HashSet;
import java.util.Set;

public class UniqueNums {
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
		System.out.println(set);

		String str = "dawdawdasdwdwdwd";
		Set<Character> set1 = new HashSet<>();
		for (int i = 0; i < str.length(); i++) {
			set1.add(str.charAt(i));
		}
        System.out.println(set1);
	}

}











