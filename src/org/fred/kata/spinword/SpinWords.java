package org.fred.kata.spinword;

import java.util.Arrays;
import java.util.stream.Collectors;

public class SpinWords {

	public static void main(String[] args) {
		System.out.println(spinWords(""));
	}
	
	public static String spinWords(String sentence) {
		//TODO: Code stuff here
//		StringBuilder sb = new StringBuilder();
//		Arrays.stream(sentence.split(" ")).forEach(s -> {sb.append(s.length()>4?new StringBuilder(s).reverse().toString():s);sb.append(" ");});
		return Arrays.stream(sentence.split(" ")).map(s -> s.length()>4?new StringBuilder(s).reverse().toString():s).collect(Collectors.joining(" "));
//		return sb.toString().trim();
	}

}
