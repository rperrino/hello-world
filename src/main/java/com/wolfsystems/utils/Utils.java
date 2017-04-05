package com.wolfsystems.utils;

/**
 * Used for common tasks.
 * @author Roberto
 *
 */
public class Utils {
	
	private static boolean error = false;
	
	/**
	 * Prints an object to the console window.
	 * @param message
	 */
	public static void print(Object message) {
		if (error)
			System.err.println(message);
		else System.out.println(message);
	}
	
	/**
	 * Set error parameter for future console prints
	 * @param err
	 */
	public static void setError(boolean err) {
		error = err;
	}
	
}
