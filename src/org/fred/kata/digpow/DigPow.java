package org.fred.kata.digpow;

public class DigPow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	/**
	 * (a ^ p + b ^ (p+1) + c ^(p+2) + d ^ (p+3) + ...) = n * k
	 * 46288 --> 4³ + 6⁴+ 2⁵ + 8⁶ + 8⁷ = 2360688 = 46288 * 51
	 * @param n
	 * @param p
	 * @return
	 */
	public static long digPow(int n, int p) {
		// your code
		int sum = 0;
		String str_n = String.valueOf(n);

		char[] cs = str_n.toCharArray();
		System.out.println("cs=>"+cs);
		for(int i=0;i<cs.length;i++){
			String str = String.valueOf(cs[i]);
			System.out.println("Math.pow("+cs[i]+", "+(p+i)+")");
			double a = Math.pow(Integer.parseInt(str), (p+i));
			System.out.println("a=>"+a);
			sum += a;
			System.out.println("sum=>"+sum);
		}

		int k = sum / n;

		if(k !=0 && k%1 == 0){
			return k;
		}

		return -1;
	}
}
