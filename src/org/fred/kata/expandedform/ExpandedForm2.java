package org.fred.kata.expandedform;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ExpandedForm2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(expandedForm(10086));
		
	}

	public static String expandedForm(int num) {
		return IntStream.range(0, String.valueOf(num).length())
				.mapToObj(x -> String.valueOf(Character.getNumericValue(String.valueOf(num).charAt(x))
						* (int) Math.pow(10, String.valueOf(num).substring(x).length() - 1)))
				.filter(x -> !x.equals("0")).collect(Collectors.joining(" + "));
	}
}
