package com.eva.rinku.sir;

import java.util.Scanner;

class FibonacciNumber {
	/*
	 * A series of number in which each (Fibonacci number) is the sum of the two
	 * preceding number
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two number");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int sum = 0;
		System.out.print(n1 + " " + n2);
		for (int i = 0; i < 10; i++) {
			sum = n1 + n2;
			System.out.print(" " + sum);
			n1 = n2;
			n2 = sum;
		}

	}

}
