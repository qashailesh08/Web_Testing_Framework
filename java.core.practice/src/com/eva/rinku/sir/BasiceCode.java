package com.eva.rinku.sir;

import java.util.Scanner;

public class BasiceCode {
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
//		leapYear();
//		findEvenOdd();
//		swapp1();
//		swapp2();
//		swapp3();
		findPercentage();
	}

	public static void leapYear() {

		System.out.println("Enter Year: ");
		int year = sc.nextInt();
		if (year % 4 == 0 || year % 400 == 0) {
			System.out.println(year + " is a leap year");
		} else {
			System.out.println(year + " is not leap year");
		}
	}

	public static void findPower() {

	}

	public static void swapp1() {
		// without using third variable
		System.out.println("Enter Two Number: ");

		int first = sc.nextInt();
		int second = sc.nextInt();
		System.err.println("\nWithout using third variable");
		System.out.println("Before swapping first: " + first + " second: " + second);
		first = first + second;
		second = first - second;
		first = first - second;
		System.out.println("After swapping first: " + first + " second: " + second);

	}

	public static void swapp2() {
		// using third variable
		System.err.println("Using third variable");
		System.out.println("Enter Two Number: ");
		int first = sc.nextInt();
		int second = sc.nextInt();
		System.out.println("Before swapping first: " + first + " second: " + second);
		int temp = 0;
		temp = first + second;
		second = temp - second;
		first = temp - second;
		System.out.println("After swapping first: " + first + " second: " + second);
	}

	public static void swapp3() {
		System.out.println("Using Bitwise operator");
		System.out.println("Enter Two Number: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("Before swapping first: " + a + " second: " + b);
		a = a ^ b;
		b = a ^ b;
		a = b ^ a;
		System.out.println("Before swapping first: " + a + " second: " + b);

	}

	public static void findPercentage() {
		int num = 2000;
		double db = 100;
		double tll = (double) num / db;
		System.out.println("percentage of "+num+" is "+tll);
	}

	public static void findEvenOdd() {
		System.out.println("Enter a Number: ");
		int num = sc.nextInt();
		if (num % 2 == 0) {
			System.out.println(num + " is even number");
		} else {
			System.out.println(num + " is odd numbber");
		}

	}
}
