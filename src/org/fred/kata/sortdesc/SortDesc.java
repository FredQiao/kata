package org.fred.kata.sortdesc;

import java.util.Arrays;
import java.util.Comparator;

public class SortDesc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static int sortDesc(final int num) {
		//Your code
		return Integer.parseInt(Arrays.stream(String.valueOf(num).split("")).sorted(Comparator.reverseOrder()).reduce((a,b) -> a+""+b).get());
	}
}
