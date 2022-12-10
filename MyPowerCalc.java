package com.hackerranck;

public class MyPowerCalc {
	/*
	 * Create the method long power(int, int) here.
	 */
	public static long power(int n, int p) throws Exception {
		if (n == 0 && p == 0)
			throw new Exception("n or p should not be zero.");
		else if (n < 0 || p < 0)
			throw new Exception("n and p should not be negative.");

		return (long) Math.pow(n, p);
	}

	public static void main(String[] args) throws Exception {
		System.out.println(power(4, 0));
	}
}
