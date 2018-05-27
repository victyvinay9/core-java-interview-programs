package com.vinay.poc.string.challenges;

/*examples of palindrome strings are "mom", "madam", "abcba", “12321”
 */
public class Palindrome {

	public static boolean testPalindrome(String test) {
		StringBuilder reverseStr = new StringBuilder();
		char[] charArr = test.toCharArray();
		int testStrLength = test.length();
		for (int i = testStrLength ; i >0; i--) {
			reverseStr.append(charArr[i-1]);
		}		
		return reverseStr.toString().equals(test);
	}

	public static void main(String[] args) {
		String testPString = "madam";
		String testNPString = "vinay";
		int intP = 12321;
		System.out.println(testNPString+ " - " + Palindrome.testPalindrome(testNPString));
		System.out.println(testPString+ " - " + Palindrome.testPalindrome(testPString));
		System.out.println(intP+ " - " + Palindrome.testPalindrome(intP+""));
		
	}
}
