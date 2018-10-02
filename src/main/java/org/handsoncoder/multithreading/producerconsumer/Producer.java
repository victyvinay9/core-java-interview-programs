package org.handsoncoder.multithreading.producerconsumer;

import java.util.Queue;
import java.util.Random;

public class Producer extends Thread {

	private int size;
	private Queue<Integer> q;

	public Producer(Queue<Integer> q, int size, String name) {
		super(name);
		this.size = size;
		this.q = q;
	}

	@Override
	public void run() {
		while (true) {
			synchronized (q) {
				while (q.size() == size) {
					try {
						System.out.println("Queue Full");
						q.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				Random i = new Random();
				int val = i.nextInt();
				System.out.println("Producing : " + val);
				q.add(val);
				q.notifyAll();
			}

		}
	}

}
