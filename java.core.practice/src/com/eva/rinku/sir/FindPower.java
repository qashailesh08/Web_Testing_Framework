package com.eva.rinku.sir;

public class FindPower {

	public static void main(String[] args) {
		int base=5;
		int power=3;
		int result=1;
		for(int i=1;i<=power;i++) {
			result*=base;
		}
		System.out.println(result);
	}

}
