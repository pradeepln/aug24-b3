package com.ibm.training.singleton;

public class ExpensiveResource {
	
	private static ExpensiveResource theOnlyInstance;// = new ExpensiveResource();
	
	private ExpensiveResource() {
		
	}
	
	public static ExpensiveResource getInstance() {
		if(theOnlyInstance == null) {
			theOnlyInstance = new ExpensiveResource();
		}
		return theOnlyInstance;
	}
	
	//loads lots of memory

}
