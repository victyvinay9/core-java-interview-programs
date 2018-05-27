package com.vinay.poc.math.challenges;

public class LargestNumber {

	public static void main(String[] args) {
		int[] intArr = { 32, 1, 17, 59, 13, 12, 18 };
		int largestNumber = -1;
		for (int i = 1; i < intArr.length; i++) {
			int temp = -2;
			if (intArr[i] > intArr[i - 1]) {
				temp = intArr[i];
			} else {
				temp = intArr[i - 1];
			}
			if (temp > largestNumber) {
				largestNumber = temp;
			}
		}
		System.out.println(largestNumber);
	}

}
