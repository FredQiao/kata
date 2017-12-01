package org.fred.kata.triangletester;

public class TriangleTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

	public static boolean isTriangle(int a, int b, int c) {
		return a + b > c && a + c > b && b + c > a;
	}
}
