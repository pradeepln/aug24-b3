package com.ibm.training.lambdas;

@FunctionalInterface
public interface MyCondition<T> {
	
	boolean test(T s);
	
	
	
}
