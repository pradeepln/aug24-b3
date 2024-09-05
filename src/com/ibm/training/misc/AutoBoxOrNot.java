package com.ibm.training.misc;

public class AutoBoxOrNot {
	
	public static void doSomething(int i) {
		
	}
	
	public static void doSomething(Object o) {
		
	}
	

	public static void main(String[] args) {
		doSomething(27); //int
		Integer i = 27;
		doSomething(i);
	}

}
