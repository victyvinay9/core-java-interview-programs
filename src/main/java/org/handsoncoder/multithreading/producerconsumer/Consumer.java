package org.handsoncoder.multithreading.producerconsumer;

import java.util.Queue;

public class Consumer extends Thread {
	private Queue<Integer> q;
	private int size;

	public Consumer(Queue<Integer> q, int size, String name) {
		super(name);
		this.q = q;
		this.size = size;
	}

	@Override
	public void run() {
		while (true) {
			synchronized (q) {
				while (q.size() == 0) {
					System.out.println("Consumed All messages");
					try {
						q.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				System.out.println("Consumed one message " + q.remove());
				q.notifyAll();
			}
		}
	}
}
