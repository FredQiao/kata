package org.fred.kata.findodd;

import java.util.ArrayList;
import java.util.List;

public class FindOdd {

	public static void main(String[] args) {
		System.out.println(findIt(new int[]{20,1,-1,2,-2,3,3,5,5,1,2,4,20,4,-1,-2,5}));
	}

	public static int findIt(int[] A) {
		List<String> b = new ArrayList<>();
		for(int a : A){
			if(b.contains(String.valueOf(a))){
				b.remove(String.valueOf(a));
			}else{
				b.add(String.valueOf(a));
			}
		}
	  	return b.size()>0?Integer.parseInt(b.get(0)):0;
	  }
}
