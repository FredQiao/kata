package org.fred.kata.findodd;

import static java.util.Arrays.stream;

public class FindOdd2 {

	public static void main(String[] args) {
		System.out.println(findIt(new int[] { 20, 1, -1, 2, -2, 3, 3, 5, 5, 1, 2, 4, 20, 4, -1, -2, 5 }));
	}

	public static int findIt(int[] arr) {
		return stream(arr).reduce(0, (x, y) -> x ^ y);
	}
}
