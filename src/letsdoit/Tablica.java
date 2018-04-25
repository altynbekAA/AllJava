package letsdoit;

public class Tablica {

	public void getTablica(int num) {
		for (int i = 1; i < 10; i++) {
			System.out.println(num + "+" + i + "=" + i * num);

		}
	}

	public void getTuz(String name) {
		for (int a = 0; a < name.length(); a++) {
			System.out.print(name.charAt(a));
		}
	}

	public void getBack(String name) {
		for (int s = name.length() - 1; s >= 0; s--) {
			System.out.print(name.charAt(s));
		}
	}

	public String stringTime(String str, int n) {
		String str1 = "";
		for (int i = 0; i < n; i++) {

			str1 += str;
		}
		return str1;
	}

	public int array(int[] arr) {

		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];

			}
		}
		return max;
	}

	public int array1(int[] arr) {

		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (min > arr[i]) {
				min = arr[i];

			}
		}
		return min;

	}

	public String birChon(String bir) {
		String letter = "";
		String result = "";
		for (int i = 0; i < bir.length(); i++) {
			if (i % 2 == 0) {
				letter = bir.charAt(i) + "";
				letter = letter.toUpperCase();
			} else {
				letter = bir.charAt(i) + "";
				letter = letter.toLowerCase();

			}
			result += letter;

		}
		return result;
	}

	public int arrayCount9(int[] num) {
		int count = 0;
		for (int i = 0; i < num.length; i++) {
			if (num[i] == 9) {
				count++;

			}
		}
		return count;
	}

	public void Load(String city) {
		String class1 = city + " to Vegas ";
		System.out.println(class1);
	}
	
		
			
	}
     







