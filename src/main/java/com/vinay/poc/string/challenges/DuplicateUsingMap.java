package com.vinay.poc.string.challenges;

import java.util.HashMap;
import java.util.Map;

public class DuplicateUsingMap {

	public static void printDuplicate(String testStr) {
		Map<Character, Integer> charMap = new HashMap<Character, Integer>();
		char[] strArr = testStr.toCharArray();
		for (int i = 0; i < strArr.length; i++) {
			
			if (charMap.get(strArr[i]) == null) {
				charMap.put(strArr[i], 1);
			} else {
				int count = charMap.get(strArr[i]);
				charMap.put(strArr[i], (count + 1));
				System.out.println("First duplicate found - " + strArr[i]);
			}
		}
		System.out.println(charMap);
	}

	public static void main(String[] args) {
		String s1 = "Shibin Madhavan";
		String s2 = "Vinay Prasad";
		DuplicateUsingMap.printDuplicate(s1);
		DuplicateUsingMap.printDuplicate(s2);
	}

}
