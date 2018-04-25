package examples;

public class MathHelper {
	int i;
	int j;
	
	public int add() {
		return i+j;
	}
	
	
	public int substract(int x, int y){
		return x-y;
	}
	public int mulitply (int x, int y) {
		return x*y;
	}
	public double divide (int x, int y) {
		return x/y;
	}
	public static void main(String[] args) {
		
		MathHelper helper = new MathHelper();
		helper.i = 10;
		helper.j = 20;
		
		int result = helper.add();
		System.out.println("the result is "+result );
		
		int subResult = helper.substract(100,76);
		System.out.println("the result of substraction is "+subResult);
		
	}	    

}
