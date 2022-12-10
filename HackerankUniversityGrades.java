package com.hackerranck;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HackerankUniversityGrades {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(73, 67, 38, 33);
		System.out.println(gradingStudents(list));
		String[] arr = { "hello", "there", "k", "xa" };
		name(100);
	}

	public static List<Integer> gradingStudents(List<Integer> grades) {
		List<Integer> res = new ArrayList<Integer>();
		int upperLimit = 0;
		int lowerLimit = 0;
		for (Integer integer : grades) {
			if (integer % 5 != 0) {
				lowerLimit = integer - integer % 5;
				upperLimit = lowerLimit + 5;
				if (integer > 37 && (upperLimit - integer) < 3) {
					integer = integer + (upperLimit - integer);
					res.add(integer);
				} else {
					res.add(integer);
				}
			} else {
				res.add(integer);
			}
		}
		return res;
	}

	public static void pali(int range) {
		for (int i = range; i <= 200; i++) {
			int num1 = i;
			int num2 = 0;
			while (num1 != 0) {
				int rem = num1 % 10;
				num1 /= 10;
				num2 = num2 * 10 + rem;
			}
			if (i == num2)
				System.out.print(i + " ");

		}
	}
}
