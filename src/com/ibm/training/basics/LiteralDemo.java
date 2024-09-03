package com.ibm.training.basics;

public class LiteralDemo {

	public static void main(String[] args) {
		int i = 10;
		
		String name = "pradeep"; //Strings have literal value despite being a class
		
		
		
		
		boolean available = true;
		
		
		char c = 'c';
		
		int oi = 042; //octal value
		int hi = 0x123a; //hex value
		char special = '\u3623'; //unicode
		
		System.out.println("oi = "+oi);
		System.out.println("hi = "+hi);
		System.out.println("special = "+special);
		
		m1(42);
		m1(42.0);
		m1(42L);
		m1(42f);
		m1(123d);

	}
	
	public static void m1(int iVal) {
		System.out.println("Doing some computation using int");
	}

	public static void m1(long lVal) {
		System.out.println("Doing some computation using long");
	}
	
	
	public static void m1(float fVal) {
		System.out.println("Doing some computation using float");
	}
	
	public static void m1(double dVal) {
		System.out.println("Doing some computation using double");
	}
}
