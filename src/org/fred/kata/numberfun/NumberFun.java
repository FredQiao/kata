package org.fred.kata.numberfun;

public class NumberFun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(findNextSquare(114));
	}

	public static long findNextSquare(long sq) {

		return Math.sqrt(sq) % 1 == 0 ? (long) Math.pow(Math.sqrt(sq) + 1, 2) : -1;
	}
}
