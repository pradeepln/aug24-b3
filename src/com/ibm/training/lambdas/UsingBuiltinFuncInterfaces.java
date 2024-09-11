package com.ibm.training.lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class UsingBuiltinFuncInterfaces {
	
//	public static List<String> transformedList(List<String> src,Function<String, String> transformationLogic){
//		List<String> result = new ArrayList<>();
//		
//		for(String aValue : src) {
//			String transformedValue = transformationLogic.apply(aValue);
//			result.add(transformedValue);
//		}
//		
//		return result;
//	}
	
	public static <T,R> List<R> transformedList(List<T> src,Function<T, R> transformationLogic){
		List<R> result = new ArrayList<>();
		
		for(T aValue : src) {
			R transformedValue = transformationLogic.apply(aValue);
			result.add(transformedValue);
		}
		
		return result;
	}
	
	

	public static void main(String[] args) {
		String[] words = new String[] {"this","is","a","series","sardine","of","weird","words","like","zebra","and","orion"};
		List<String> list = Arrays.asList(words);
		
		List<String> excitingWords = transformedList(list, s -> s + "!");
		System.out.println(excitingWords);
		
		List<String> eyeWords = transformedList(list, s -> s.replace("i", "eye"));
		System.out.println(eyeWords);
		
		List<String> caps = transformedList(list, s -> s.toUpperCase());
		System.out.println(caps);

		List<Integer> squares = transformedList(List.of(1,2,3,4), i -> i*i);
		System.out.println(squares);

		List<Integer> lengths = transformedList(list, s -> s.length());
		System.out.println(lengths);
	}

}
