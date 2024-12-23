package com.eva.rinku.sir;

import java.util.Scanner;

public class SumOfDigit {

	public static void main(String[] args) {
		int sum=0, rem;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int num = sc.nextInt();
		while(num>0) {
			rem=num%10;
			sum=sum+rem;
			num=num/10;
		}
		System.out.println(sum);

	}

}
