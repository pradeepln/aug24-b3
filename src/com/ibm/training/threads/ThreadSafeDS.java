package com.ibm.training.threads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ThreadSafeDS {

	public static void main(String[] args) {
		List<String> l = new ArrayList<>(); // not thread safe
		
		Map<String, String> m = new HashMap<>(); // not thread safe
		
		List<String> sl = Collections.synchronizedList(l);
		
		Map<String, String> tsMap = new ConcurrentHashMap<>();
		
		

	}

}
