package org.handsoncoder.sorting;

import java.util.Arrays;

/**
 * 1. Divide and Conquer Algorithm 
 * 2. Recursive 
 * 3. Not stable 
 * 4. In Place 
 * 5.
 * Time Complexity 
 * O(nlogn) -> best or average case 
 * O(n2) -> Worst case (Can be avoided by using Randomized partition)
 * 
 */

public class QuickSort {

	public static void main(String[] args) {
		//int[] arr = new int[] { 4, 8, 7, 5, 9, 2, 1, 3 };
		int[] arr = new int[] {7,2,1,6,8,5,3,4 };
		new QuickSort().quickSort(arr);
		System.out.println(Arrays.toString(arr));
	}

	private int[] quickSort(int[] arr) {
		int start = 0;
		int end = arr.length - 1; // #1 length -1
		quickSort(arr, start, end);
		return arr;
	}

	private void quickSort(int[] arr, int start, int end) {
		if (start < end) { // #2 start < end
			int pIndex = partition(arr, start, end);
			quickSort(arr, start, pIndex - 1); // #3 start to pIndex-1 First Half
			quickSort(arr, pIndex, end); // #4 pIndex to end Second Hald
		}
	}

	private int partition(int[] arr, int start, int end) {
		int pIndex = start; // #5 intialize pIndex to start of segment
		int pivot = arr[end]; // #6 intialize pivot to end of segment
		for (int i = start; i < end; i++) { // #7 logic to push anything smaller to pivot to left
			if (arr[i] < pivot) {
				int temp = arr[i];
				arr[i] = arr[pIndex];
				arr[pIndex] = temp;
				pIndex++;
			}
		}
		int temp = arr[end]; // #8 swap last pIndex with pivot and return
		arr[end] = arr[pIndex];
		arr[pIndex] = temp;
		return pIndex;
	}
}
