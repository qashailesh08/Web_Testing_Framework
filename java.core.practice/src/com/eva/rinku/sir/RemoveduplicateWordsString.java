package com.eva.rinku.sir;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveduplicateWordsString {

	public static void main(String[] args) {

		String word = "Ram going to Ram mandir";
		String[] split = word.split(" ");
		Set<String> set=new LinkedHashSet<String>();
		for(String s:split) {
			set.add(s);
		}
		for(String word1:set) {
			System.out.print(word1+" ");
		}
		
	}
	

}
