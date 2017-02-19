package com.java8skills.org;

import org.apache.commons.lang3.StringUtils;

import com.google.common.base.Preconditions;

/**
 * Wrapper class for the {@link GreetingService} and {@link Calculation}
 * 
 * @author Madhu
 *
 */

public class LambdaExample {

	/**
	 * Calculates the operation between two parameters
	 * 
	 * @param a
	 *            first integer parameter argument
	 * @param b
	 *            second integer parameter argument
	 * @param calculate
	 *            calculates as per the operator called
	 * @return calculates and return the result
	 */
	public int calculate(int a, int b, Calculation calculate) {
		Preconditions.checkArgument(calculate != null);
		return calculate.operation(a, b);
	}

	/**
	 * This method will greet the user with the provided message.
	 * 
	 * @param message
	 *            Message provided by the user.
	 * @return message returned by the method.
	 */
	public String greetMessage(String message) {
		Preconditions.checkArgument(StringUtils.isNotBlank(message));
		return GreetingService.greetService.sayMessage(message);
	}

}
