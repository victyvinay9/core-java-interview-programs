package org.handsoncoder.multithreading.producerconsumer;

import java.util.LinkedList;
import java.util.Queue;

public class ProdConsumeTest {

	public static void main(String[] args) {
		Queue <Integer> q = new LinkedList<Integer>();
		int size = 10;
		
		Thread producer = new Producer(q, size, "Producer");
		Thread consumer = new Consumer(q, size, "Consumer");
		producer.start();
		consumer.start();
		

	}

}
