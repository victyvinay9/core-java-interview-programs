package org.handsoncoder.singleton;

public class DCSingleton {
	private volatile static DCSingleton INSTANCE;

	private DCSingleton() {
	}

	public static DCSingleton getInstance() {
		if (INSTANCE == null) {
			synchronized (DCSingleton.class) {
				if (INSTANCE == null) {
					INSTANCE = new DCSingleton();
				}

			}
		}
		return INSTANCE;
	}
	public void show() {
		System.out.println("Singleton example using double checked locking");
	}
}
