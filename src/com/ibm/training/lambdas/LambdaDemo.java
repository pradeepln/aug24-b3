package com.ibm.training.lambdas;

import java.util.Arrays;

public class LambdaDemo {

	public static void main(String[] args) {
		String[] words = new String[] {"this","is","a","series","sardine","of","weird","words","like","zebra","and","orion"};
		
		System.out.println(Arrays.asList(words));
		
		//Arrays.sort(words, (String s1, String s2) -> {return s1.length() - s2.length();}); //step1
		
		//Arrays.sort(words, (s1,s2) -> {return s1.length() - s2.length();}); //step2
		
		//Arrays.sort(words, (s1,s2) -> s1.length() - s2.length()); //step3
		
		
		//Arrays.sort(words,(s1,s2) -> s2.length() - s1.length());
		
		//Arrays.sort(words,(s1,s2) -> s1.charAt(0) - s2.charAt(0));
		
		Arrays.sort(words,(s1,s2) -> {
			if(s1.contains("e") && !s2.contains("e")) {
				return -1;
			}else if(!s1.contains("e") && s2.contains("e")) {
				return 1;
			}else {
				return 0;
			}
		});
		System.out.println(Arrays.asList(words));
	}

}
