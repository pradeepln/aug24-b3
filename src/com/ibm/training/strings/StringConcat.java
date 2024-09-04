package com.ibm.training.strings;

import com.ibm.training.basics.Employee;

public class StringConcat {

	public static void main(String[] args) {
		
		String s1 = "hello ";
		String s2 = "world";
		
		//String s3 = s1.concat(s2);
		
		String s3 = s1 + s2; //===> s1.concat(s2)
		
		System.out.println(s3);
		
		int i = 42;
		
		//same for i + s1
		String s4 = s1 + i; 
		
		//==> above line converted into ==> s4 = s1.concat(String.valueOf(i));
		
		System.out.println(s4);
		
		Employee e = new Employee(234, "sam", 1234);
		
		String s5 = s1 + e;
		s5 = s1.concat(e.toString());
		
		System.out.println(e);
		
		System.out.println(s5);

	}

}
