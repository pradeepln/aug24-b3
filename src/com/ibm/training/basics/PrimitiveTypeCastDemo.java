package com.ibm.training.basics;

public class PrimitiveTypeCastDemo {

	public static void main(String[] args) {
		//implicit type casts
		long l = 42;
		double d = 42;
		
		
		//explicit cast
		
		int i = (int) l;
		
		System.out.println(i);
		
		long bigNumber = 2147483648L;
		
		System.out.println(bigNumber);
		
		int truncatedInt = (int) bigNumber;
		
		System.out.println(truncatedInt);

	}

}
