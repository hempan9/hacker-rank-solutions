package com.hackerranck;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 
 * @author hobject
 *
 *         The maximum height candles are units high. There are of them, so
 *         return . Function Description Complete the function
 *         birthdayCakeCandles in the editor below. birthdayCakeCandles has the
 *         following parameter(s): int candles[n]: the candle heights Returns
 *         int: the number of candles that are tallest
 */
public class BirthdayCandles {
	public static int birthdayCakeCandles(List<Integer> candles) {
		int count = 0;
		Collections.sort(candles);
		int max = candles.get(candles.size() - 1);
		for (int i = 0; i < candles.size(); i++) {
			if (candles.get(i) == max) {
				count += 1;
			}
		}
		return count;

	}

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 4, 5, 6, 7, 7, 7, 8);
		System.out.println(birthdayCakeCandles(list));
	}
}