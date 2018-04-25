package exceptions;

import org.w3c.dom.ranges.RangeException;

public class TryCatchFinally {
	public static void main(String[] args) {
		
		
		String str = "123";
		long l = new Long(str);
		Long.parseLong(str);
		
		Long.valueOf(str).longValue();
		
		
		
		char c;
		int i ;
		c = 'a';
		i = c;
		i++;
		
		
		
		int s,w,e;
		s=w=e=9;
		System.out.println(s);
		
		
		
		
		
	
		try {
			int[] nums = {123,34,123,45};
			System.exit(0);
			System.out.println(nums[2]+nums[4]);
			
		}catch(Exception e1) {
			System.out.println(e1);
			return;
		}finally {
			System.out.println("finally");
		}
		
		
		
	}

}




