package interveiwTasks;

public class Alt5yn2bek {
	public static void main(String[] args) {
		String str = "Alt5y5n2b9ek";
		int sum = 0;
		for (int i = 0; i < str.length(); i++) {
			if (Character.isDigit(str.charAt(i))) {
				sum += Character.getNumericValue(str.charAt(i));
			}
		}
		System.out.println(sum);
	}
}
