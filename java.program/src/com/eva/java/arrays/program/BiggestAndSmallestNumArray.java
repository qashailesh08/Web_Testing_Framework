package com.eva.java.arrays.program;

public class BiggestAndSmallestNumArray {

	public static void main(String[] args) {
		int []num= {2,6,999,3,5,1,0};
		int small=num[0];
		int big=num.length-1;
		for (int i = 0; i < num.length; i++) {
			if(big>num[i]) {
				small=num[i];
			}
			if(small<num[i]) {
				big=num[i];
			}
		}
		System.out.println("Smallest Number in Arr is :- "+small);
		System.out.println("Biggest Number in Arr is :- "+big);
		
	}

}
