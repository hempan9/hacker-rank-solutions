package com.hackerranck;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SwapUsername {
	public static List<String> possibleChanges(List<String> usernames) {
		// Write your code here
		Object[] charL = usernames.toArray();
		List<String> list = new ArrayList<>();

		for (int i = 0; i < charL.length; i++) {
			for (int j = usernames.get(i).length(); j < charL.length; j++) {

			}

		}
		return list;

	}

	public static void main(String[] args) {
		List<String> list = Arrays.asList("hydra", "3", "foo");
		System.out.println(possibleChanges(list));
	}

}
