package exceptions;

public class MultiCatch {

	public static void main(String[] args) {
		String st1 = null;
		try {
			int i = Integer.parseInt("12aws34");
			int l = st1.length();
			System.out.println(i);
			System.out.println(l);

		} catch (NullPointerException e) {
			System.out.println(e);

		} catch (NumberFormatException e) {
			System.out.println(e);

		}finally {
			System.out.println("done");
		}
		

	}

}



