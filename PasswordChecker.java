package com.hackerranck;

public class PasswordChecker {
	/*
	 * Complete the 'minimumNumber' function below.
	 *
	 * The function is expected to return an INTEGER. The function accepts following
	 * parameters: 1. INTEGER n 2. STRING password
	 */

	public static int minimumNumber(int n, String password) {
		// Return the minimum number of characters to make the password strong
		if (hasLowercase(password) >= 1 && isNumberOccurs(password) >= 1 && hasSpecialChar(password) >= 1
				&& hasUppercase(password) >= 1 && password.length() >= 6) {
			return 0;
		} else {

			return 6 - password.length();
		}
	}

	public static int isNumberOccurs(String s) {
		int count = 0;
		String numbers = "0123456789";

		for (int i = 0; i < s.length(); i++) {
			for (int k = 0; k < numbers.length(); k++) {
				if (s.charAt(i) == numbers.charAt(k)) {
					count++;
				}
			}
		}
		return count;
	}

	public static int hasUppercase(String s) {
		int count = 0;
		String upper_case = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		for (int i = 0; i < s.length(); i++) {
			for (int j = 0; j < upper_case.length(); j++) {
				if (s.charAt(i) == upper_case.charAt(j)) {
					count += 1;
				}
			}
		}
		return count;
	}

	public static int hasLowercase(String s) {
		int count = 0;
		String lower_case = "abcdefghijklmnopqrstuvwxyz";
		for (int i = 0; i < s.length(); i++) {
			for (int j = 0; j < lower_case.length(); j++) {
				if (s.charAt(i) == lower_case.charAt(j)) {
					count += 1;
				}
			}
		}
		return count;
	}

	public static int hasSpecialChar(String s) {
		int count = 0;
		String special_characters = "!@#$%^&*()-+";
		for (int i = 0; i < s.length(); i++) {
			for (int j = 0; j < special_characters.length(); j++) {
				if (s.charAt(i) == special_characters.charAt(j)) {
					count += 1;
				}
			}
		}
		return count;
	}

	public static void main(String[] args) {
		System.out.println(minimumNumber(6, "abc@d1"));
	}
}