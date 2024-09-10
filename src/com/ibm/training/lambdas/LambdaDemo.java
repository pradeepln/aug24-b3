package com.ibm.training.lambdas;

import java.util.Arrays;

public class LambdaDemo {
	
	static int si = 100;

//signature
//  accSp   modi  ret  name  args-types,num  throws
//arity
//                ret        args-types,num
	public static void main(String[] args) {
		String[] words = new String[] {"this","is","a","series","sardine","of","weird","words","like","zebra","and","orion"};
		
		System.out.println(Arrays.asList(words));
		
		int localI = 10;
		//Arrays.sort(words, (String s1, String s2) -> {return s1.length() - s2.length();}); //step1
		
		//Arrays.sort(words, (s1,s2) -> {return s1.length() - s2.length();}); //step2
		
		//Arrays.sort(words, (s1,s2) -> s1.length() - s2.length()); //step3
		
		
		//Arrays.sort(words,(s1,s2) -> s2.length() - s1.length());
		
		//Arrays.sort(words,(s1,s2) -> s1.charAt(0) - s2.charAt(0));
		
//		Arrays.sort(words,(s1,s2) -> {
//			//System.out.println(localI); //local vars can be accessed only if they are effectively final
//			if(s1.contains("e") && !s2.contains("e")) {
//				return -1;
//			}else if(!s1.contains("e") && s2.contains("e")) {
//				return 1;
//			}else {
//				return 0;
//			}
//		});
		//arity            2Str-in     int out
//		Arrays.sort(words, (s1,s2) -> wordsWithEFirst(s1, s2));
		
		Arrays.sort(words,LambdaDemo::wordsWithEFirst);
		
		System.out.println(Arrays.asList(words));
		
		//localI++;
	}
	
//arity           int out               2 Str in	
	public static int wordsWithEFirst(String s1,String s2){
		if(s1.contains("e") && !s2.contains("e")) {
			return -1;
		}else if(!s1.contains("e") && s2.contains("e")) {
			return 1;
		}else {
			return 0;
		}
	}

}
