package com.eva.rinku.sir;

import java.util.*;

public class CountRepeatedWord {

	public static void main(String[] args) {
		count();
	}

	public static void count() {
		String name = "shailesh";
		char[] charArray = name.toCharArray();
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		int count = 0;
		for (int i = 0; i <=charArray.length-1; i++) {
			count = 0;
			for (int j = 0; j <= charArray.length-1; j++) {
				if (charArray[i] == charArray[j]) {
					count++;
				} else {
					map.put(charArray[i], count);
				}
			}

		}

		for (Character ch : map.keySet()) {
			System.out.print(ch + "=" + map.get(ch)+", ");
		}

	}

}
