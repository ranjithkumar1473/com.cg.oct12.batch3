package com.cg.day5.exc.App;

public class ThrowsDemo {

	public static int divideNumbers(int dividend, int divisor) throws ArithmeticException {

		return dividend / divisor;

	}

	public static void main(String[] args) {

		System.out.println("Start");
		try {
			System.out.println(ThrowsDemo.divideNumbers(10, 0));
		} catch (ArithmeticException ae) {
			System.out.println(ae.getMessage());
		}
		System.out.println("End");

	}

}