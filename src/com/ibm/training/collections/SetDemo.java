package com.ibm.training.collections;

import java.util.Scanner;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		
//		Set<String> uniqueWords = new HashSet<>(); //iteration order not same as insertion order
		
//		Set<String> uniqueWords = new LinkedHashSet<>(); //iteration order same as insertion order
		
		TreeSet<String> uniqueWords = new TreeSet<>(); //internally sorted . All elements are kept in asc order
		
//		TreeSet<String> uniqueWords = new TreeSet<>(new StringLengthComparator()); //internally sorted . All elements are kept in asc order
		
		Scanner kb = new Scanner(System.in);
		
		while(true) {
			System.out.println("Enter a word: ");
			String input = kb.nextLine();
			if(input.equals("quit")) {
				break;
			}
			
			boolean added = uniqueWords.add(input);
			if(!added) {
				System.out.println("That was a duplicate!!");
			}
		}

		System.out.println("______________ All Values ________________");
		
		for(String aWord : uniqueWords.descendingSet()) {
			System.out.println(aWord);
		}
	}

}
