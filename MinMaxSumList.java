package com.hackerranck;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 
 * @author hobject
 *
 *         The minimum sum is and the maximum sum is . The function prints 16 24
 *         Function Description Complete the miniMaxSum function in the editor
 *         below. miniMaxSum has the following parameter(s): arr: an array of
 *         integers Print Print two space-separated integers on one line: the
 *         minimum sum and the maximum sum of of elements. Input Format A single
 *         line of five space-separated integers.
 * 
 */
public class MinMaxSumList {
	public static void miniMaxSum(List<Integer> arr) {
		// Write your code here
		int minSum = 0;
		int maxSum = 0;
		Collections.sort(arr);
		for (int i = 0; i < arr.size() - 1; i++) {
			minSum += arr.get(i);
		}
		for (int i = 1; i < arr.size(); i++) {
			maxSum += arr.get(i);
		}
		System.out.println(minSum + " " + maxSum);

	}

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 3, 5, 7, 9);
		miniMaxSum(list);
	

	}
}
