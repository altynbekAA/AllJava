package letsdoit;

public class MaxAndMin {
	public static void main(String[] args) {
		int[] array = { 4, 6, 10, 70,1,455, 45, 3, 34 };
		int Integer =2;

		int Max = array[0];
		int Min = array[0];

		for (int index = 0; index < array.length; index++) {
			if (array[index] > Max) {
				Max = array[index];

			}

			if (array[index] < Min) {
				Min = array[index];

			}
		}

		System.out.println("MIN " + Min);
		System.out.println("MAX " + Max);

	}

}
