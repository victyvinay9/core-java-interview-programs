package com.vinay.poc.math.challenges;

import java.util.HashMap;
import java.util.Map;

public class NumberToTest {

	public static void main(String[] args) {
		int n = 2345;
		HashMap<Integer, String> map = getPopulatedMap();

		String nStr = n + "";
		if (nStr.length() < 4) {
			System.out.println(convertNumberToWord(n, map));

		} else if (nStr.length() < 5) {
			StringBuffer word = new StringBuffer();
			word.append(convertNumberToWord(Integer.parseInt(nStr.charAt(0) + ""), map));
			word.append(map.get(1000));
			word.append(convertNumberToWord(Integer.parseInt(nStr.substring(1, 4)), map));
			System.out.println(word.toString());
		} else if (nStr.length() < 6) {
			StringBuffer word = new StringBuffer();
			word.append(convertNumberToWord(Integer.parseInt(nStr.charAt(0) + ""), map));
			word.append(map.get(1000));
			word.append(convertNumberToWord(Integer.parseInt(nStr.substring(1, 4)), map));
			System.out.println(word.toString());

		} else if (nStr.length() < 7) {

		} else if (nStr.length() < 8) {

		} else if (nStr.length() < 9) {

		} else if (nStr.length() < 10) {

		}
	}

	private static HashMap<Integer, String> getPopulatedMap() {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "one");
		map.put(2, "two");
		map.put(3, "three");
		map.put(4, "four");
		map.put(5, "five");
		map.put(6, "six");
		map.put(7, "seven");
		map.put(8, "eight");
		map.put(9, "nine");
		map.put(10, "ten");
		map.put(11, "eleven");
		map.put(12, "twelve");
		map.put(13, "thirteen");
		map.put(14, "fourteen");
		map.put(15, "fifteen");
		map.put(16, "sixteen");
		map.put(17, "seventeen");
		map.put(18, "eighteen");
		map.put(19, "nineteen");
		map.put(20, "twenty");
		map.put(30, "thrirty");
		map.put(40, "fourty");
		map.put(50, "fifty");
		map.put(60, "sixty");
		map.put(70, "seventy");
		map.put(80, "eigty");
		map.put(90, "ninety");
		map.put(100, "hundered");
		map.put(1000, "thousand");
		map.put(1000000, "million");
		map.put(100000000, "billion");
		map.put(0, "");

		return map;
	}

	static String convertNumberToWord(int number, Map map) {
		StringBuffer str = new StringBuffer();
		if (number < 10) {
			// its a single digit no
			str.append(map.get(number));
		} else if (number < 100) {
			// its a two digit no
			int tenthPlace = (number / 10) * 10;
			int unitPlace = (number - tenthPlace);
			str.append(map.get(tenthPlace));
			str.append(map.get(unitPlace));
		} else if (number < 1000) {
			// its a three digit no
			int hundredThPlace = number / 100;
			int tenthPlace = ((number - (hundredThPlace * 100)) / 10) * 10;
			int unitPlace = (number - (hundredThPlace * 100) - tenthPlace);
			str.append(map.get(hundredThPlace));
			str.append("hundred");
			str.append(map.get(tenthPlace));
			str.append(map.get(unitPlace));
		}

		return str.toString();
	}

}
