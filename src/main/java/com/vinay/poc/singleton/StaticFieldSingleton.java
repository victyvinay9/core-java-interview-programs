package com.vinay.poc.singleton;

public class StaticFieldSingleton {
	private static final StaticFieldSingleton INSTANCE = new StaticFieldSingleton();

	private StaticFieldSingleton() {
	}

	public static StaticFieldSingleton getInstance() {
		return INSTANCE;
	}

	public void show() {
		System.out.println("Singleton example using static final");
	}
}
