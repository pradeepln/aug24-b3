package com.ibm.training.basics;

public class ArrayDemo {

	public static void main(String[] args) {
		
		int[] iArray = new int[10];

		for(int i = 0; i < iArray.length ; i++) {
			System.out.print(iArray[i]+"\t");
			iArray[i] = i * i;
		}
		
		System.out.println("\n_______________________________________________");
		
		for(int i = 0; i < iArray.length ; i++) {
			System.out.print(iArray[i]+"\t");
			
		}
		System.out.println("\n_______________________________________________");
		
		String[] words = {"hi","how","are","you","!"};
		
		for(int i = 0; i < words.length ; i++) {
			System.out.print(words[i]+"\t");
			
		}
	}

}
