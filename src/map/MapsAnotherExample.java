package map;

import java.util.HashMap;
import java.util.Map;

public class MapsAnotherExample {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();

		//key is Malaysia
		//value is KL
		map.put("Malaysia", "KL");
		
		map.put("Kyrgyzstan", "Osh");
		System.out.println(map);
		
		map.put("Malaysia", "Sunway");
		System.out.println(map);
		System.out.println("------------------------------------------------------");
		
		System.out.println(map.get("Malaysia"));
		System.out.println(map.get("Brazil"));
		System.out.println("------------------------------------------------------");
		//keyset() : returns the keys in the map
       // System.out.println(map.keySet().size());
        System.out.println(map.size());
        
        
        for(String key: map.keySet()) {
        	System.out.println("key: "+key);
        	System.out.println("value: "+map.get(key));
        	System.out.println("**********");
        }
        
        
        
        Map<String, String> person1 = new HashMap<>();
        person1.put("name", "Donaldino");
        person1.put("age", "19");
        person1.put("city", "NY");
        
        Map<String, String> person2 = new HashMap<>();
        person2.put("name", "Amine");
        person2.put("age", "old enough");
        person2.put("city", "DC");
        
        System.out.println(person1);
        System.out.println(person2);


        
        
        
        
        
	}
}



















