package com.ibm.training.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		//simpleRawListOps();
		//simpleGenericList();
		
		simpleLinkedListOps();
	}

	public static void myAlgo(List<String> l) {
		l.add("some data");
		
		//lots of other stuff
		
		String data = l.get(0);
		
		//lots of ops
		l.add(0, "new first");
		
		
		
		//lots of ops
		
		l.remove(0);
		
		//more stuff
		
		//set up loop - assume this list has a million elements
//		System.out.println("_________________ IN SOME ALGO METHOD ___________________");
//		for(int i = 0; i < l.size(); i++) {
//			String aValue = l.get(i); //this is a random-access op. not at all high perf in all ds
//			//do some thing with aValue
//			System.out.println(aValue);
//		}
		
		
		System.out.println("_______________ Loop Using Iterator ____________");
		Iterator<String> it = l.iterator();
		
		while(it.hasNext()) {
			String aValue = it.next();
			//do whatever with aValue
			System.out.println(aValue);
		}
		
		System.out.println("_______________ Enhanced For Loop _________");
		
		for(String aValue : l) {
			//do whatever with aValue
			System.out.println(aValue);
		}
		
	}
	
	
	
	
	
	private static void simpleLinkedListOps() {
		LinkedList<String> ll = new LinkedList<String>();
		
		ll.add("first");
		ll.add("third");
		ll.add(1,"second");
		
		System.out.println("size: "+ll.size());
		System.out.println("toString : "+ll);
		
		ll.addFirst("real first"); //O(1)
		
		ll.addLast("last");
		
		System.out.println(ll);
		
		ll.removeFirst(); //O(1)
		
		System.out.println(ll);
		
		System.out.println("_______ everyting in ll ________");
		for(int i = 0; i < ll.size(); i++) {
			String aValue = (String) ll.get(i); //random-access: O(n)
			System.out.println(aValue);
		}
		
		myAlgo(ll);
	}

	private static void simpleGenericList() {
		List<String> sList = new ArrayList<>();
		
		List<Integer> iList = new ArrayList<>();
		
		//sList.add(123);
		sList.add("123");
		
		//iList.add("123");
		iList.add(2343);
		
		String s = sList.get(0);
		int i = iList.get(0);
		
		myAlgo(sList);
	}

	private static void simpleRawListOps() {
		ArrayList l = new ArrayList();

		l.add("hello");
		l.add("world");

		System.out.println("size : " + l.size());
		System.out.println("is there world in l? " + l.contains("world"));

		l.add(1, "beautiful"); //O(n)
		
		System.out.println("size : " + l.size());

		System.out.println("toString : " + l);

		l.remove("hello");

		System.out.println("size : " + l.size());

		System.out.println("toString : " + l);
		
		System.out.println("Element at 0 "+ l.get(0));//random - access : O(1)
		
		l.add("more");
		l.add("elements");
		
		System.out.println("_______ everyting in l ________");
		for(int i = 0; i < l.size(); i++) {
			String aValue = (String) l.get(i);//random - access : O(1)
			System.out.println(aValue);
		}
		
		System.out.println("_______________________________");
		
		ArrayList nums = new ArrayList();
		nums.add(12);
		nums.add(123);
		nums.add(234);
		
		Integer aNum = (Integer) l.get(2);
	}

}
