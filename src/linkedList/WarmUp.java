package linkedList;

import java.util.List;

public class WarmUp {

	public static void main(String[] args) {

		boolean res = hasDuplicates(new int[] { 5, 3, 10, 1 });
		System.out.println(res);

		boolean res2 = hasDuplicates(new int[] { 2, 3, 4, 5, 6 });
		System.out.println(res2);

	}

	public static boolean hasDuplicates(int[] nums) {
		if (nums.length <= 1)
			return false;

		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; i++) {
				System.out.println(nums[i] + " -> " + nums[j]);
				if (nums[i] == nums[j]) {
					return true;
				}
			}
		}
		return false;
	}

	public static boolean hasDuplicates(List<Integer> nums) {
		if (nums.size() <= 1)
			return false;

		for (int i = 0; i < nums.size(); i++) {
			for (int j = i + 1; j < nums.size(); j++) {
				System.out.println(nums.get(i) + " " + nums.get(j));
				if (nums.get(i) == nums.get(j)) {
					return true;
				}
			}
		}
		return false;
	}

}
