package com.ibm.training.basics;

public class FinalDemo {

	public static void main(String[] args) {
		
		int i = 10;
		
		i = 25;
		
		i++;
		
		final int FI = 10;
		
//		FI = 25;
//		FI++;

		final Employee e = new Employee(1, "pradeep");
		
		e.setSalary(2324);
		e.name = "Pradeep";
		
		//e = new Employee(92, "8988");
	}

}

//final
 class Parent{
	
	//final
	public void doSomething() {}
	
}

class Child extends Parent{
	@Override
	public void doSomething() {}
}




