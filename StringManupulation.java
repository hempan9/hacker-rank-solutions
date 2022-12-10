package com.hackerranck;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

/*
 * This exercise is to test your understanding of Java Strings. A sample String declaration:
String myString = "Hello World!"
The elements of a String are called characters. The number of characters in a String is called the length, and it can be retrieved with the String.length() method.
Given two strings of lowercase English letters,  and , perform the following operations:
Sum the lengths of  and .
Determine if  is lexicographically larger than  (i.e.: does  come before  in the dictionary?).
Capitalize the first letter in  and  and print them on a single line, separated by a space.
Input Format
The first line contains a string . The second line contains another string . The strings are comprised of only lowercase English letters.
Output Format
There are three lines of output: 
For the first line, sum the lengths of  and . 
For the second line, write Yes if  is lexicographically greater than  otherwise print No instead. 
For the third line, capitalize the first letter in both  and  and print them on a single line, separated by a space.

 */
public class StringManupulation {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		String B = sc.next();

		/* Enter your code here. Print output to STDOUT. */
		System.out.println((A + B).length());
		System.out.println(A.compareTo(B));
		if (A.compareTo(B) <= 1)
			System.out.println("No");
	
		else 
			System.out.println("Yes");
		String both = A + " " + B;

		String s = Arrays.stream(both.split(" ")).map(
				word -> word.isEmpty() ? word : Character.toTitleCase(word.charAt(0)) + word.substring(1).toLowerCase())
				.collect(Collectors.joining(" "));
		System.out.println(s);
	}

}
