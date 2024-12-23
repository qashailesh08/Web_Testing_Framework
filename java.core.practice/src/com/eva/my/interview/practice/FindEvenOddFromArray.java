package com.eva.my.interview.practice;

import java.util.*;

public class FindEvenOddFromArray {

	public static void main(String[] args) {
//		evenOdd();
		smallBig();
	}

	public static void evenOdd() {
		int num[] = { 23, 2, 76, 34, 78, 33, 45 };
		List<Integer> even = new LinkedList<Integer>();
		List<Integer> odd = new LinkedList<Integer>();
		for (int i = 0; i < num.length; i++) {
			if (num[i] % 2 == 0) {
				even.add(num[i]);
			} else {
				odd.add(num[i]);
			}
		}
		System.out.print("Evens number: ");
		for (int a : even) {
			System.out.print(a + " ");
		}
		System.out.print("\nOdds: ");
		for (int b : odd) {
			System.out.print(b + " ");
		}

	}

	public static void smallBig() {
		int num[] = { 23, 2, 76, 34, 78, 33, 45 };
		int big = 0;
		int small = 0;
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < i; j++) {
				if (num[i] > num[j]) {
					big = num[i];
				} 
			}
		}

		System.out.println("big "+big);
		
	}

}
