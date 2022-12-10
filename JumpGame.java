package com.hackerranck;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JumpGame {
	public static void main(String[] args) {
		List<Integer> arr = Arrays.asList(100, -23, -23, 404, 100, 23, 23, 23, 3, 3);
		//List<Integer> arr= Arrays.asList(7, 8, 7);
		System.out.println(jumpAyub(arr));
	}

	public static int jumpAyub(List<Integer> arr) {
		int lastIndex = arr.size()-1;
		int size = arr.size();
		int count =0;
		int step = 0;
		if(arr.get(0).equals(arr.get(lastIndex))) {
			count+=1;
			return count;
		}
		else {
			for (int i = 0; i < arr.size(); i++) {
				for (int j = i+1; j < arr.size(); j++) {
					if(arr.get(i).equals(arr.get(j)) && i!=j) {
						i =j;
						if(i+1<size && arr.get(i+1).equals(arr.get(lastIndex))) {
							return count+=2;
						}
						if(i-1>=0 && arr.get(i-1).equals(arr.get(lastIndex))) {
							return count+=3;
						}
						
					}
					
				}
			}
		}
	return 0;
	}

}
