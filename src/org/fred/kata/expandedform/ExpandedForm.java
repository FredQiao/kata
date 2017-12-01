package org.fred.kata.expandedform;

import java.util.ArrayList;
import java.util.List;

public class ExpandedForm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(expandedForm(10086));
	}

	public static String expandedForm(int num) {
		// your code here
		String sNum = String.valueOf(num);
		
		List<String> ss = new ArrayList<>();
		
		char[] c = sNum.toCharArray();
		
		for(int i = 0;i<c.length;i++){
			if(Integer.parseInt(String.valueOf(c[i])) != 0){
				ss.add(String.valueOf(Math.round(Integer.parseInt(String.valueOf(c[i])) * Math.pow(10, c.length-i-1))));
			}
		}
		
		
		
		return ss.stream().reduce((a, b)-> a+" + "+b).get().toString();
	}
}
