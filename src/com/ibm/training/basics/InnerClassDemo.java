package com.ibm.training.basics;

class Outer{
	
	private int outerI = 23;
	
	class Inner{
		
		public void innerMethod() {
			outerI++;
		}
	}
	
	public void testInner() {
		Inner innerObj = new Inner();
		innerObj.innerMethod();
		
		System.out.println("Outer I = "+outerI);
	}
}



public class InnerClassDemo {

	public static void main(String[] args) {
		Outer o = new Outer();
		o.testInner();

	}

}
