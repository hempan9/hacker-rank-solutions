package com.hackerranck;

public class TimeConversion {
	public static String timeConversion(String s) {
		// Write your code here
		String[] S = s.split(":");
		int hours = Integer.parseInt(S[0]);
		String ss;
		if (S[2].endsWith("PM")) {
			if (hours < 12) {
				hours = hours + 12;
			}
			if (hours == 12) {
				hours = 12;
			}
			ss = hours + ":" + S[1] + ":" + S[2].replace("PM", "");
			return ss;
		} else if (S[2].endsWith("AM") && hours == 12) {
			hours = 0;
			ss = "0" + hours + ":" + S[1] + ":" + S[2].replace("AM", "");
			return ss;
		} else {
			ss = "0" + hours + ":" + S[1] + ":" + S[2].replace("AM", "");
			return ss;

		}

	}

	public static void main(String[] args) {
		// String time = "12:45:54PM";
		String time = "07:45:54PM";
		System.out.println(timeConversion(time));
	}

}
