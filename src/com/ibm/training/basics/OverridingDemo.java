package com.ibm.training.basics;

class Base{
	public void m1() {
		System.out.println("Base m1");
	}
	
	private void m2() {
		System.out.println("Base m2");
	}
}

class ChildOfBase extends Base{
	@Override
	public void m1() {
		System.out.println("Child m1");
	}
	
//	@Override
//	public void m2() {
//		System.out.println("Child m2");
//	}
}

public class OverridingDemo {

	public static void main(String[] args) {
		Base b = new Base();
		
		b.m1();
//		b.m2();
		
		b = new ChildOfBase();
		
		b.m1();

	}

}
