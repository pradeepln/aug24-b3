package com.ibm.training.collections;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		
//		Set<String> uniqueWords = new HashSet<>(); iteration order not same as insertion order
		
		Set<String> uniqueWords = new LinkedHashSet<>(); //iteration order same as insertion order
		
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
		
		for(String aWord : uniqueWords) {
			System.out.println(aWord);
		}
	}

}
