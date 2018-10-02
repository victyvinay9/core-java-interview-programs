package org.handsoncoder.singleton;

public class StaticFieldSingleton {
	private static final StaticFieldSingleton INSTANCE = new StaticFieldSingleton();

	private StaticFieldSingleton() {
		System.out.println("loaded once");
	}

	public static StaticFieldSingleton getInstance() {
		return INSTANCE;
	}

	public void show() {
		System.out.println("Singleton example using static final");
	}
}
