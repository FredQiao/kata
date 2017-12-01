package org.fred.kata.accum;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Accum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static String accum2(String s){
		return IntStream.range(0, s.length())
				.mapToObj(i -> IntStream.range(0, i + 1)
						.mapToObj(i1 -> i1 == 0 ? String.valueOf(s.charAt(i)).toUpperCase() : String.valueOf(s.charAt(i)).toLowerCase())
						.collect(Collectors.joining())
				).collect(Collectors.joining("-"));
	}

	public static String accum(String s) {
		// your code
		StringBuilder sb = new StringBuilder();
		String str_n = String.valueOf(s);
		char[] cs = str_n.toCharArray();

		for(int i=0;i<cs.length;i++){
			sb.append(genMutiString(String.valueOf(cs[i]).toLowerCase(), i+1));
			if(i<cs.length-1){
				sb.append("-");
			}
		}
		return sb.toString();
	}
	
	public static String genMutiString(String s, int num){
		StringBuilder sb = new StringBuilder();
		for(int j=0;j<num;j++){
			if(j==0){
				sb.append(s.toUpperCase());
			}else{
				sb.append(s);
			}
		}
		return sb.toString();
	}
}
