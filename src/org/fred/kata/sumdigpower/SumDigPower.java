package org.fred.kata.sumdigpower;

import java.util.ArrayList;
import java.util.List;

public class SumDigPower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sumDigPow(100, 200).forEach(a -> System.err.println(a));
		;
	}

	public static List<Long> sumDigPow(long a, long b) {
		// your code
		List<Long> digits = new ArrayList<>();

		do {
			if (digPow(a, 1) == 1) {
				digits.add(a);
			}
			a++;
		} while (a <= b);
		return digits;
	}

	public static double digPow(long a2, int p) {
		// your code
		double sum = 0;
		String str_n = String.valueOf(a2);

		char[] cs = str_n.toCharArray();
		for (int i = 0; i < cs.length; i++) {
			String str = String.valueOf(cs[i]);
			sum += Math.pow(Integer.parseInt(str), (p + i));
		}
		double k = sum / a2;
		if (k != 0 && k % 1 == 0) {
			return k;
		}

		return -1;
	}

}
