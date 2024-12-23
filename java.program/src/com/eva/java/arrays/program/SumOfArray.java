package com.eva.java.arrays.program;

public class SumOfArray {
	public static void main(String[] args) {
		int[] num = { 10, 10, 10, 10, 10 };
		int sum = 0;
		for (int i = 0; i < num.length; i++) {
			sum = sum + num[i];
		}
		System.out.println("Sum of array is :- " + sum);
	}

}
