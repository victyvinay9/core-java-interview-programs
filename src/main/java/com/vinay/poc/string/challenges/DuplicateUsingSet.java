package com.vinay.poc.string.challenges;

import java.util.HashSet;
import java.util.Set;

public class DuplicateUsingSet {

	public static void printDuplicate(String testStr){
		Set <Character> charSet = new HashSet<Character>();
		boolean found = false;
		for (char s : testStr.toCharArray()){
			if (charSet.contains(s)) {
				found = true;
				System.out.println("Found the first repeated char - " + s);
				break;
			}else {
				charSet.add(s);
			}			
		}
		if (!found)System.out.println("No duplicates");
	}
	public static void main(String[] args) {
		String s1 = "Shibin Madhavan";
		String s2 = "Vinay Prasad";
		DuplicateUsingSet.printDuplicate(s1);
		DuplicateUsingSet.printDuplicate(s2);
	}

}
