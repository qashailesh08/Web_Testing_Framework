package com.eva.rinku.sir;

import java.util.Scanner;

public class String_Sorting {
	private static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		strAcendingOrder();
		System.out.println();
//		strDecendingOrder();
	}

	public static void strAcendingOrder() {
		System.out.println("Enter string : ");
		String name=sc.next();
		char ch[] = name.toCharArray();
		char temp;
		for (int i = 0; i < ch.length; i++) {
			for (int j = i + 1; j < ch.length; j++) {
				if(ch[i]==' ') {
					continue;
				}
				if (ch[i] > ch[j]) {
					temp = ch[i];
					ch[i] = ch[j];
					ch[j] = temp;
				}
			}
		}
		for (char chr : ch) {
			System.out.print(chr + " ");
		}
	}

	public static void strDecendingOrder() {
		System.out.println("Enter string : ");
		String name=sc.next();
		
		char ch[] = name.toCharArray();
		char temp;
		for (int i = 0; i < ch.length; i++) {
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] < ch[j]) {
					temp = ch[i];
					ch[i] = ch[j];
					ch[j] = temp;
				}
			}
		}
		for (char chr : ch) {
			System.out.print(chr + " ");
		}
	}

}
