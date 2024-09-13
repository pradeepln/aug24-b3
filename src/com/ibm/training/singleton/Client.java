package com.ibm.training.singleton;

public class Client {

	public static void main(String[] args) {
		
		ExpensiveResource r1 = ExpensiveResource.getInstance(); //new ExpensiveResource();
		
		
		ExpensiveResource r2 = ExpensiveResource.getInstance(); //new ExpensiveResource();
		
		//ExpensiveResource.theOnlyInstance = null;

	}

}
