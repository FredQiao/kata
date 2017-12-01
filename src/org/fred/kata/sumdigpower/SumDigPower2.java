package org.fred.kata.sumdigpower;

import java.util.ArrayList;
import java.util.List;

public class SumDigPower2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sumDigPow(100, 200).forEach(a -> System.err.println(a));
		;
	}

	public static List<Long> sumDigPow(long a, long b) {
		List<Long> result = new ArrayList<>();
		for (long i = a; i <= b; i++)
			if (isEureka(i))
				result.add(i);
		return result;
	}

	private static boolean isEureka(long n) {
		long tmp = n;
		long sum = 0;
		int power = length(n);
		while (tmp > 0) {
			sum += (long) Math.pow(tmp % 10, power);
			tmp /= 10;
			power--;
		}
		return sum == n;
	}

	private static int length(long n) {
		int length = 0;
		while (n > 0) {
			n /= 10;
			length++;
		}
		return length;
	}

}
