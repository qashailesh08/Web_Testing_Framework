package com.eva.rinku.sir;

import java.util.Scanner;

public class Largest_Smallest_Number_Array {

	public static void main(String[] args) {
		int num[] = { 10000, 6, 20, 473456, 90, 56,0 };
		int larg = num[0];
		int small = num[0];
		for (int i = 0; i < num.length; i++) {
			if (num[i] < small) {
				small = num[i];
			} else if (num[i] > larg) {
				larg = num[i];
			}
		}
		System.out.println("Larg: "+larg);
		System.out.println("Small: "+small);
	}

}
