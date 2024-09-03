package com.ibm.training.basics;

public class ReferenceVsObjectDemo {

	public static void main(String[] args) {
		Point p1 = new Point(10, 20);

		Point p2 = p1;

		System.out.println("p1 says " + p1.whereAmI());

		System.out.println("p2 says " + p2.whereAmI());

		System.out.println("Moving p1 to 20,30");
		p1.x = 20;
		p1.y = 30;

		System.out.println("p1 says " + p1.whereAmI());

		System.out.println("p2 says " + p2.whereAmI());
		
		doSomeGeometry(p1);
		System.out.println("After geometry.............");
		
		System.out.println("p1 says " + p1.whereAmI());

		System.out.println("p2 says " + p2.whereAmI());
	}

	
	public static void doSomeGeometry(Point p) {
		
		System.out.println(" doing something with "+p.whereAmI());
		
		p.y = -333;
		
	}
}
