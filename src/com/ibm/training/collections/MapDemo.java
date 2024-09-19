package com.ibm.training.collections;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		mapOps();
		String s1 = "abc";
		String s2 = new String("abc");
		
//		if(s1.equals(s2)) {
//			System.out.println(s1.hashCode() == s2.hashCode());
//		}
	}

	private static void mapOps() {
		
//		Map<String, Integer> runsMap = new HashMap<>(); //iteration order is not same as insertion order
		
		Map<String, Integer> runsMap = new LinkedHashMap<>(); //iteration order is same as insertion order
		
//		Map<String, Integer> runsMap = new TreeMap<>(); //all entries arranged in asc order of keys
		
		runsMap.put("virat", 12);
		runsMap.put("rohit", 45);
		runsMap.put("bumrah", 37);
		runsMap.put("virat", 34);
		runsMap.put("xavier", 21);
		
	
		
		System.out.println("How many runs for virat ? "+runsMap.get("virat"));
		
		System.out.println("How many runs for bumrah ? "+runsMap.get("bumrah"));
		
		System.out.println("How many runs for rahul ? "+runsMap.get("rahul"));
		
		System.out.println("Is there run info for a player called xavier? "+runsMap.containsKey("xavier"));
		System.out.println("Is there run info for a player called rahul? "+runsMap.containsKey("rahul"));
		
		
		System.out.println("Has anyone scored exactly 37 runs? "+runsMap.containsValue(37));
		
		//runsMap.remove("xavier");
		//System.out.println("Is there run info for a player called xavier? "+runsMap.containsKey("xavier"));
		
		System.out.println("________________ All key-value pairs ____________________");
		Set<String> keys = runsMap.keySet();
		
		for(String aKey : keys) {
			System.out.println(aKey +" -----------> " + runsMap.get(aKey));
		}
	}

}
