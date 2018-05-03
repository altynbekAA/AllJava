package almaz;

import java.util.HashMap;
import java.util.Map;

public class Ibo {
	public static void main(String[] args) {
		
	
	String str = "U2l3a7n";
	int a=0;
	for (int i = 0; i < str.length(); i++) {
		if(!Character.isDigit(str.charAt(i))) {
		  continue;
		}else {
			a+=Integer.parseInt(str.charAt(i)+"");
		}
		
		
	}
	System.out.println(a);
	
	
	
	
	Map <String, String> map = new HashMap<>();
	map.put("Kyrgyzstan", "Bishkek");
	map.put("USA", "Washington DC");
	System.out.println(map);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
