package com.ibm.training.lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OurOwnFunIntfDemo {
	
	public static List<String> allMatches(List<String> src, MyCondition condition){
		List<String> result = new ArrayList<>();
		for(String aString : src) {
			if(condition.test(aString)) {
				result.add(aString);
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
	}

}
