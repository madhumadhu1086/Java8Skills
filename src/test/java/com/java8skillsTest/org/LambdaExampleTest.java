package com.java8skillsTest.org;

import com.java8skills.org.Calculation;
import com.java8skills.org.LambdaExample;

import org.junit.Test;
import org.hamcrest.Matchers;
import org.junit.Assert;

/**
 * This class tests for the LambdaExample class
 * 
 * @author Madhu
 *
 */
public class LambdaExampleTest {

	private LambdaExample lambda = new LambdaExample();

	/**
	 * This test case will test for success scenario for Addition
	 */
	@Test
	public void testForCalcuclateAdditionSuccessScenario() {
		int Values = lambda.calculate(5, 6, Calculation.addition);
		Assert.assertThat(Values, Matchers.is(11));
	}

	/**
	 * This test case will test for success scenario for Subtraction
	 */
	@Test
	public void testForCalcuclateSubtractionSuccessScenario() {
		int Values = lambda.calculate(5, 6, Calculation.subtraction);
		Assert.assertThat(Values, Matchers.is(-1));
	}

	/**
	 * This test case will test for success scenario for Multiplication
	 */
	@Test
	public void testForCalcuclateMultiplicationSuccessScenario() {
		int Values = lambda.calculate(5, 6, Calculation.multiplication);
		Assert.assertThat(Values, Matchers.is(30));
	}

	/**
	 * This test case will test for success scenario for Division
	 */
	@Test
	public void testForCalcuclateDivisionSuccessScenario() {
		int Values = lambda.calculate(5, 6, Calculation.division);
		Assert.assertThat(Values, Matchers.is(0));
	}

	/**
	 * This test case will test for success scenario for greeting.
	 */
	@Test
	public void testForGreetingSuccessScenario() {
		String result = lambda.greetMessage("test");
		Assert.assertThat(result, Matchers.is("Hello test"));
	}

	/**
	 * This test case will test for the {@link IllegalArgumentException} when
	 * the provided parameter is null
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testForGreetingWhenMessageParameterIsNull() {
		String result = lambda.greetMessage(null);
	}

	/**
	 * This test case will test for the {@link IllegalArgumentException} when
	 * the provided parameter is Blank.
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testForGreetingWhenMessageParameterIsBlank() {
		String result = lambda.greetMessage("");
	}

	/**
	 * This test case will look for IllegalArgumentException when the Calculate
	 * operation is provided is null.
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testForIllegalArgumentExceptionWhenCalculateIsPassedAsNull() {
		int Values = lambda.calculate(5, 6, null);
	}

}
