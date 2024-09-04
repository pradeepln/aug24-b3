package com.ibm.training.misc;

import com.ibm.training.basics.Car;
import com.ibm.training.basics.Employee;

public class GCDiscussion {

	public static void main(String[] args) {
		
		int mainI = 25;
		Employee e = new Employee(12, "dd");
		m1();
		//spot z
	}

	private static void m1() {
		
		boolean active = true;
		Car c = new Car();
		m2(c);
		//spot y
	}

	private static void m2(Car carObj) {
		int[] nums = new int[88];
		float f = 123f;
		//spot x
		
	}

}
