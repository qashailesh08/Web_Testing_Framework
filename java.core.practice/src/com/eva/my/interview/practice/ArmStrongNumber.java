package com.eva.my.interview.practice;

public class ArmStrongNumber {

	public static void main(String[] args) {

		int num = 153;
		int reminder = 0;
		int result = 0;
		int original = num;
		while (num > 0) {
			reminder = num % 10;
			result = result + (reminder * reminder * reminder);
			num = num / 10;

		}

		if (original == result) {
			System.out.println(result + " is a armstrong number");
		} else
			System.out.println(result + " not is a armstrong number");
	}

}
