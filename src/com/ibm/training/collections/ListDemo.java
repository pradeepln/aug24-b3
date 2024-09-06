package com.ibm.training.collections;

import java.util.ArrayList;

public class ListDemo {

	public static void main(String[] args) {
		simpleRawListOps();

	}

	private static void simpleRawListOps() {
		ArrayList l = new ArrayList();

		l.add("hello");
		l.add("world");

		System.out.println("size : " + l.size());
		System.out.println("is there world in l? " + l.contains("world"));

		l.add(1, "beautiful");
		System.out.println("size : " + l.size());

		System.out.println("toString : " + l);

		l.remove("hello");

		System.out.println("size : " + l.size());

		System.out.println("toString : " + l);
		
		System.out.println("Element at 0 "+ l.get(0));
		
		l.add("more");
		l.add("elements");
		
		System.out.println("_______ everyting in l ________");
		for(int i = 0; i < l.size(); i++) {
			String aValue = (String) l.get(i);
			System.out.println(aValue);
		}
		
		System.out.println("_______________________________");
	}

}
