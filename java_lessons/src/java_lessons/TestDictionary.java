package java_lessons;

import java.util.HashMap;
import java.util.Map;

public class TestDictionary {
/*
 * this is an example from Schaums outlines data structures w/ java
 * specifically it is an example showing HashMap
 */
	public static void main(String[] args) {
		Map map = new HashMap();
		map.put("Tag", "day");
		map.put("Hut", "hat");
		map.put("Uhr", "clock");
		map.put("Rad", "wheel");
		map.put("Ohr", "ear");
		map.put("Tor", "gate");
		System.out.println( "map = "+ map);
		System.out.println("map.size() = "+ map.size());
		System.out.println("map.keyset() = "+ map.keySet());
		System.out.println("map.values() = "+ map.values());
		System.out.println("map.get(\"Uhr\") =  "+ map.get("Uhr"));
		

	}//end main

}//end class
