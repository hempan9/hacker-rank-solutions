package com.hackerranck;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LonelyInteger {
	public static int lonelyinteger(List<Integer> a) {

		int dup = 0;

		for (int i = 1; i < a.size(); i++) {
			if ((a.get(dup) != a.get(i))) {
				dup ^= a.get(i);
			}

		}
		return dup;

	}

	public static void main(String[] args) {
		List<Integer> a = new ArrayList<>();
		a.add(0);
		a.add(0);
		a.add(1);
		a.add(2);
		a.add(1);

		System.out.println(lonelyinteger(a));
	}
}