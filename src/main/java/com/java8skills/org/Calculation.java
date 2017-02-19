package com.java8skills.org;

/**
 * This class is used for calculation of user provided numbers and the method
 * and return the results.
 * 
 * @author Madhu
 *
 */
public interface Calculation {

	/**
	 * This method takes two integer values as input.
	 * 
	 * @param a
	 *            First integer parameter
	 * @param b
	 *            Second integer parameter.
	 * @return value of the calculated operation.
	 */
	int operation(int a, int b);

	Calculation addition = (int a, int b) -> a + b;
	Calculation subtraction = (a, b) -> a - b;
	Calculation multiplication = (int a, int b) -> {
		return a * b;
	};
	Calculation division = (int a, int b) -> a / b;

}
