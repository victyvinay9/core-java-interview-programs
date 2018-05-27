package com.vinay.poc.math.challenges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* In fibonacci series, next number is the sum of previous two numbers for example 
 * 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 etc. 
 * The first two numbers of fibonacci series are 0 and 1.*/
public class Fibonacci {

	public static void main(String[] args) {
		int sizeOfFibSeries = 10;
		int[] fibonacciSeries = new int[11];

		fibonacciSeries[0] = 0;
		fibonacciSeries[0] = 1;

		for (int i = 2; i <= sizeOfFibSeries; i++) {
			fibonacciSeries[i] = fibonacciSeries[i - 1] + fibonacciSeries[i - 2];
		}
		
		System.out.println(Arrays.toString(fibonacciSeries));
		
		List<Integer> intArrList = new ArrayList<Integer>();
		
		for (int i : fibonacciSeries) {
			intArrList.add(i);
		}
		System.out.println(intArrList);
	}
}
