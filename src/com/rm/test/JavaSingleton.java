package com.rm.test;

public class JavaSingleton {
	/* Private constructor */
	private static final JavaSingleton INSTANCE;
	private JavaSingleton() {
		/* the body of the constructor here */
	}

	/* Access point to the unique instance of the singleton */
	public static JavaSingleton getInstance() {
		return INSTANCE;
	}

	private static class JavaSingletonHolder {
		private static final JavaSingleton INSTANCE = new JavaSingleton();
	}
}
