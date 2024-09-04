package com.ibm.training.strings;

import com.ibm.training.basics.Car;

public class StringObjectsAndLiterals {

	public static void main(String[] args) {
		Car c = new Car();
		
		String s1 = "hello"; //literal value

		System.out.println(s1.toUpperCase());
		
		String msg = s1 + " World";
		
		System.out.println(msg);
		
		String s2 = "hello"; //also literal
		
		String s3 = new String("hello"); //not a literal
		
		System.out.println("s1 == s2 ? "+(s1 == s2));
		System.out.println("s1 == s3 ? "+(s1 == s3));
		
		System.out.println("s1.equals(s2) ? "+(s1.equals(s2)));
		System.out.println("s1.equals(s3) ? "+(s1.equals(s3)));
		
		String joined = s1.concat(" World!");
		
		System.out.println("s1 = "+s1);
		System.out.println("s2 = "+s2);
		
		System.out.println("joioned = "+joined);
	}

}
