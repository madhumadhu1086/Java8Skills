package com.java8skills.org;

/**
 * This method takes the input provided by the user and return the updated
 * message.
 * 
 * @author Madhu
 *
 */
public interface GreetingService {

	GreetingService greetService = message -> {
		return "Hello " + message;
	};

	/**
	 * Helper method to call greetService.
	 * 
	 * @param message
	 *            This is the message provided by user.
	 * @return updated message.
	 */
	public String sayMessage(String message);
}
