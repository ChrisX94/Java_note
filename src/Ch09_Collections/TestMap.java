package Ch09_Collections;

import java.util.HashMap;
import java.util.Map;


public class TestMap {
	
	public static void main(String[] args) {

	Map<String, Integer> map = new HashMap<String, Integer>();
	
	map.put("test1", 1);
	map.put("test2", 2);
	map.put("test3", 3);
	
	System.out.println(map.get("test1"));
	
	for(String key : map.keySet())
		System.out.print(map.get(key));
	
	System.out.println();
	
	// remove key
	map.remove("test3");
	
	for(String key : map.keySet())
		System.out.print(map.get(key));
	
	
	}
}
