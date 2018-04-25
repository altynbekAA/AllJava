package linkedList;

import java.util.HashMap;
import java.util.Map;

public class MapEx {
public static void main(String[] args) {
	//K, V
	Map<String, Double> menu = new HashMap<>();
	menu.put("Coffee", 2.99);
	menu.put("Cappucino", 3.99);
	menu.put("Hot Chocolate", 3.49);
	menu.put("Hot Chocolate", 3.55);

	
	System.out.println(menu.size());
	System.out.println(menu);
	
	System.out.println(menu.get("Coffee"));
	
	System.out.println(menu.keySet());
	System.out.println(menu.values());

	menu.put("reg Coffee", menu.get("Coffee"));
	System.out.println(menu);

}
}






