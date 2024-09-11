package com.ibm.training.lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OurOwnFunIntfDemo {
	
	public static <T> List<T> allMatches(List<T> src, MyCondition<T> condition){
		List<T> result = new ArrayList<>();
		for(T aValue : src) {
			if(condition.test(aValue)) {
				result.add(aValue);
			}
		}
		return result;
	}

	public static void main(String[] args) {
		String[] words = new String[] {"this","is","a","series","sardine","of","weird","words","like","zebra","and","orion"};
		List<String> list = Arrays.asList(words);
		
		List<String> wordsBiggerThan3 = allMatches(list, s -> s.length() > 3);
		System.out.println(wordsBiggerThan3);
		List<String> wordsWithLetterE = allMatches(list,s -> s.contains("e"));
		System.out.println(wordsWithLetterE);
		
		List<Integer> iList = List.of(1,3,56,45,62,12,71,23);
		List<Integer> evens = allMatches(iList, i -> i%2 == 0);
		System.out.println(evens);
		
		//List<String> x = allMatches(list,s -> s.charAt(20) == 'c');
	}

}
