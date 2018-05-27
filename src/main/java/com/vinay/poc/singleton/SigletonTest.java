package com.vinay.poc.singleton;

public class SigletonTest {

	public static void main(String[] args) {
		EnumSingleton.INSTANCE.show();
		StaticFieldSingleton.getInstance().show();
		DCSingleton.getInstance().show();
	}
}
