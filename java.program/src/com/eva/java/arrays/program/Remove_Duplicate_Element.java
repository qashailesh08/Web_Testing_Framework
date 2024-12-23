package com.eva.java.arrays.program;

public class Remove_Duplicate_Element {
	public static void main(String[] args) {
		int[] num = { 2, 4, 2, 5, 3, 2, 6, 4 };
		for (int i = 0; i < num.length; i++) {
			boolean flag = false;
			for (int j = 0; j < i; j++) {
				if (num[j] == num[i]) {
					flag = true;
					break;
				}

			}
			if (!flag) {
				System.out.println(num[i]);
			}
		}
	}
}
