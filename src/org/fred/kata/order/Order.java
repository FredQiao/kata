package org.fred.kata.order;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Order {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static String order2(String words) {
		return Arrays.stream(words.split(" "))
				.sorted(Comparator.comparing(s -> Integer.valueOf(s.replaceAll("\\D", ""))))
				.reduce((a, b) -> a + " " + b).get();
	}

	public static String order(String words) {
		// ...
		if(words == null || words.length() == 0){
			return "";
		}

		String[] arrWords = words.split(" ");

		Map<Integer, String> orderMap = new HashMap<>();

		for(String word:arrWords){
			orderMap.put(Integer.parseInt(getTheString(word)), word);
		}

		List<Integer> list = new ArrayList<Integer>(orderMap.keySet());

		Collections.sort(list, (Integer a, Integer b) -> a > b ? 1:-1);

		StringBuilder sb = new StringBuilder();
		for(Iterator<Integer> iterator = list.iterator();iterator.hasNext();){
			sb.append(orderMap.get(iterator.next()) + " ");
		}

		return sb.toString().trim();
	}
	
	public static String getTheString(String s){
		Pattern pattern = Pattern.compile("\\d");
		Matcher matcher = pattern.matcher(s);
		if (matcher.find()) {
			return matcher.group();
		}
		return null;
	}
}
