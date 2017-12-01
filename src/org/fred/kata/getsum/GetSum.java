package org.fred.kata.getsum;

public class GetSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static int getSum(int a, int b) {
		// Good luck!
		if (a > b) {
			int c = a;
			a = b;
			b = c;
		}
		int sum = 0;
		while (a <= b) {
			sum += a++;
		}
		return sum;
	}
}
