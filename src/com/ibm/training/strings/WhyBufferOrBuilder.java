package com.ibm.training.strings;

public class WhyBufferOrBuilder {

	public static void main(String[] args) {
		String[] words = {"this","is","an","array","of","lots","of","strange","words","like","xylene"};
		
		String sentence = formSentence(words);
		System.out.println(sentence);
	}

	private static String formSentence(String[] words) {

//		String sentence = "";
//		for(int i = 0; i < words.length; i++) {
//			sentence = sentence + words[i] + " ";
//		}
//		return sentence;
		
		StringBuilder buffer = new StringBuilder();
		for(int i = 0; i < words.length; i++) {
			buffer.append(words[i]+" ");
		}
		
		return buffer.toString();
	}

}
