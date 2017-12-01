package org.fred.kata.findnb;

public class FindNb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static long findNb(long m) {
		// your code
		while(m>1){
			return m*m*m + findNb(m-1);
		}
		return m*m*m;
	}
}
