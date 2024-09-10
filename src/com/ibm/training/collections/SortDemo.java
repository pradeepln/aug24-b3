package com.ibm.training.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.ibm.training.basics.Employee;

public class SortDemo {

	public static void main(String[] args) {
		//sortArrayOfString();
		//sortListOfString();
		//sortListOfUserDefinedType();
		//sortListOfUserDefinedTypeNonNatural();
		//sortArrayOfStringBasedOnLength();
		sortArrayOfStringBasedOnLengthUsingAnon();
	}
	
	private static void sortListOfUserDefinedTypeNonNatural() {
		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee(71, "seventy first", 71000));
		empList.add(new Employee(51, "fifty first", 551000));
		empList.add(new Employee(81, "eighty first", 1000));
		empList.add(new Employee(11, "onety first", 12200));
		
		System.out.println("emp list before sorting based on salary\n"+empList);
		
		Collections.sort(empList, new EmployeeSalaryComparator());
		
		System.out.println("emp list after sorting based on salary\n"+empList);
		
	}

	private static void sortListOfUserDefinedType() {
		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee(71, "seventy first", 71000));
		empList.add(new Employee(51, "fifty first", 551000));
		empList.add(new Employee(81, "eighty first", 1000));
		empList.add(new Employee(11, "onety first", 12200));
		
		System.out.println("emp list before sorting\n"+empList);
		
		Collections.sort(empList);
		
		System.out.println("emp list after sorting\n"+empList);
		
	}

	private static void sortListOfString() {
		String[] words = new String[] {"this","is","a","series","of","weird","words","like","zebra","and","orion"};
		
		List<String> wordList = Arrays.asList(words);
		
		System.out.println("list before sorting \n" + wordList);
		Collections.sort(wordList);
		System.out.println("list after sorting \n" + wordList);
		
	}

	private static void sortArrayOfString() {
		String[] words = new String[] {"this","is","a","series","of","weird","words","like","zebra","and","orion"};
		System.out.println("before sorting \n" + Arrays.toString(words));
		Arrays.sort(words);
		System.out.println("after sorting \n" + Arrays.toString(words));
		
	}
	
	private static void sortArrayOfStringBasedOnLength() {
		String[] words = new String[] {"this","is","a","series","of","weird","words","like","zebra","and","orion"};
		System.out.println("before sorting \n" + Arrays.toString(words));
		
		Arrays.sort(words, new StringLengthComparator());
		
		System.out.println("after sorting \n" + Arrays.toString(words));
		
	}
	
	private static void sortArrayOfStringBasedOnLengthUsingAnon() {
		String[] words = new String[] {"this","is","a","series","of","weird","words","like","zebra","and","orion"};
		System.out.println("before sorting anon \n" + Arrays.toString(words));
		
		Arrays.sort(words, new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				return s1.length() - s2.length();
			}
		});
		
		System.out.println("after sorting \n" + Arrays.toString(words));
		
	}

}
