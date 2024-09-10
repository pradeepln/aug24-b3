package com.ibm.training.collections;

import java.util.ArrayList;
import java.util.List;

public class GenericMethodDemo {

	public static void main(String[] args) {
		
		List<String> l = constructAList("hi","hello");

		List<Integer> l2 = constructAList(14,71);
		
		//List<String> s = constructAList("hi", 1234);
		
		
	}
	
	private static <T> List<T> constructAList(T e1, T e2) {
		List<T> list = new ArrayList<>();
		list.add(e1);
		list.add(e2);
		
		return list;
	}
	
	

//	private static List<String> constructAList(String e1, String e2) {
//		List<String> list = new ArrayList<>();
//		list.add(e1);
//		list.add(e2);
//		
//		return list;
//	}
//	
//	private static List<Integer> constructAList(Integer e1, Integer e2) {
//		List<Integer> list = new ArrayList<>();
//		list.add(e1);
//		list.add(e2);
//		
//		return list;
//	}

}
