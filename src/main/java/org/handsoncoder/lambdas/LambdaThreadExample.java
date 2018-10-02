package org.handsoncoder.lambdas;

public class LambdaThreadExample {

	public static void main(String[] args) {
		Thread t1 = new Thread(new Runnable() {
			public void run() {
				System.out.println("Run from the inner class");

			}
		});
		Thread t2 = new Thread(() -> System.out.println("Run from Lambda"));
		t1.run();
		t2.run();
	}

}
