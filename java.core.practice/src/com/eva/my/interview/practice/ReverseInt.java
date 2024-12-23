package com.eva.my.interview.practice;

public class ReverseInt {

	public static void main(String[] args) {
		int num = 12034;
		int rem = 0;
		while (num != 0) {
			rem = rem * 10 + num % 10;
			num /= 10;
		}
		System.out.print(rem + " ");
	}

}
