package com.eva.rinku.sir;

public class ArraySorting {

	public static void main(String[] args) {
		acendingOrder();
		System.out.println();
		decendingOrder();
//		System.out.println(100+200+"Java");
//		System.out.println("java"+100+200);

	}

	public static void acendingOrder() {
		int[] num = { 1, 5, 3, 7, 4, 9 };
		int temp = 0;
		for (int i = 0; i < num.length; i++) {
			for (int j = i; j < num.length; j++) {
				if (num[j] < num[i]) {
					temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}
		}
		for (int a : num) {
			System.out.print(a + " ");
		}

	}
	public static void decendingOrder() {
		int[] num = { 1, 5, 3, 7, 4, 9 };
		int temp = 0;
		for (int i = 0; i < num.length; i++) {
			for (int j = i; j < num.length; j++) {
				if (num[j] > num[i]) {
					temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}
		}
		for (int a : num) {
			System.out.print(a + " ");
		}

	}

}
