package com.hackerranck;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Triplets {
	public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
		// Write your code here
		int countA = 0;
		int countB = 0;
		List<Integer> res = new ArrayList<>();
		for (int i = 0; i < a.size(); i++) {
			if (a.get(i) > b.get(i)) {
				countA += 1;
			} else if (a.get(i) < b.get(i)) {
				countB += 1;
			}
		}
		res.add(countA);
		res.add(countB);

		return res;

	}

	public static void main(String[] args) {
		List<Integer> listA = Arrays.asList(17, 28, 30);
		List<Integer> listB = Arrays.asList(99, 16, 8);
		System.out.println(compareTriplets(listA, listB));
	}
}
