package org.handsoncoder.java.basics;

public class CallByValueExample {
	
	public static void main(String[] args) {

		String current = "Version-1";
		String previous = current;
		
		current = "Version-2";
		
		System.out.println("current value : "+current + " , previous value : "+ previous);
	
	}
	
}
