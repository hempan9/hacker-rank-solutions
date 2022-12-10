package com.hackerranck;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/*
 * Function Description
Complete the getSmallestAndLargest function in the editor below.
getSmallestAndLargest has the following parameters:
string s: a string
int k: the length of the substrings to find
Returns
string: the string ' + "\n" + ' where and are the two substrings
Input Format
The first line contains a string denoting . 
The second line contains an integer denoting .
Constraints

 consists of English alphabetic letters only (i.e., [a-zA-Z]).
Sample Input 0
welcometojava
3
Sample Output 0
ava
wel
Explanation 0
String  has the following lexicographically-ordered substrings of length :

We then return the first (lexicographically smallest) substring and the last (lexicographically largest) substring as two newline-separated values (i.e., ava\nwel).
The stub code in the editor then prints ava as our first line of output and wel as our second line of output.
 */
public class SubStringSmallAndLarge {
	public static String getSmallestAndLargest(String s, int k) {
		String smallest = "";
		String largest = "";
		// Complete the function
		// 'smallest' must be the lexicographically smallest substring of length 'k'
		// 'largest' must be the lexicographically largest substring of length 'k'
		String t = "";
		String left = "";
		int i = 0;
		int swap = k;
		List<String> list = new ArrayList<String>();
		while (i < s.length() - 1) {
			t = s.substring(i, k);
			list.add(t);
			left = s.substring(k);
			i = k;
			k += swap;

		}
		System.out.println(list);

			Collections.sort(list);
			largest = list.get(list.size()-1);
			smallest = list.get(0);

		System.out.println(list);

		return smallest + "\n" + largest;
	}

	public static void main(String[] args) {
		System.out.println(getSmallestAndLargest("welcometojava", 3));
		List<Integer> ALlIds = Arrays.asList(1,2,3,4,6);
		List<Integer> UserInputids = Arrays.asList(3,6,7,9);
	
		
		}

}
