package com.hackerranck;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class diagnolDifference {
	public static int diagonalDifference(List<List<Integer>> arr) {
		int sumRightDiagonal = 0;
		int sumLeftDiagnol = 0;
		int totalSum = 0;
		int s = arr.size();
		for (int i = 0; i < s; i++) {
			for (int j = 0; j < arr.get(0).size(); j++) {
				if (i == j) {
					sumRightDiagonal += arr.get(i).get(j);
				}
				if ((i + j) == s-1) {
					sumLeftDiagnol += arr.get(i).get(j);
				}

			}
			totalSum = Math.abs((sumLeftDiagnol - sumRightDiagonal));
		}
		return totalSum;

	}

	public static void main(String[] args) {
		List<List<Integer>> arr = new ArrayList<List<Integer>>();
		List<Integer> row1 = Arrays.asList(1, 2, 3);
		List<Integer> row2 = Arrays.asList(4, 5, 6);
		List<Integer> row3 = Arrays.asList(9, 8, 9);
		arr.add(row1);
		arr.add(row2);
		arr.add(row3);
		System.out.println(diagonalDifference(arr));
	}

}
