package HomeTasks;

public class FindElementUtil {
	String userWord;

	public int getIndex(String array[]) {
		for (int i = 0; i < array.length; i++) {
			if (userWord.equalsIgnoreCase(array[i])) {
				return i;
			}
		}
		return -1;
	}

}
