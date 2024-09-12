package com.ibm.training.streams;

import java.util.Arrays;
import java.util.List;

public class StreamDemo {

	public static void main(String[] args) {
		String[] words = new String[] {"this","is","a","series","sardine","of","weird","words","like","zebra","and","orion"};
		List<String> wordList = Arrays.asList(words);
		
		
//		wordList
//			.stream()
//			.forEach(s -> System.out.println(s));

//		wordList
//			.stream()
//			.map(s -> s.toUpperCase())
//			.forEach(s -> System.out.println(s));
		
		List<String> upperCaseWords = wordList
										.stream()
										.map(s -> s.toUpperCase())
										.toList();
		System.out.println(upperCaseWords);
//		
		List<Integer> lengths = wordList
									.stream()
									.map(s -> s.length())
									.map(i -> i * i)
									.toList();
		System.out.println(lengths);
		
//		wordList
//			.stream()
//			.filter(s -> s.length() > 2)
//			.forEach(s -> System.out.println(s));
		
		
//		List<String> eyeWords = 
//				wordList
//					.stream()
//					.map(s -> s.replace("i", "eye"))
//					.map(s -> s.length())
//					.map(i -> ""+i)
//					.distinct()
//					.sorted()
//					.toList();
//		System.out.println(eyeWords);
		
//		List<String> sortedWords = 
//				wordList
//					.stream()
//					.sorted((s1,s2) -> s1.length() - s2.length())
//					.toList();
//		
//		System.out.println(sortedWords);
		
		boolean anyHaveZ = wordList.stream().anyMatch(s -> s.contains("z"));
		
		System.out.println("any have z ? "+anyHaveZ);
		

		int longest = 
				wordList
					.stream()
					.map(s -> s.length())
					.max((i1,i2) -> i1 - i2)
					.orElse(0);
		System.out.println(longest);
	}

}
