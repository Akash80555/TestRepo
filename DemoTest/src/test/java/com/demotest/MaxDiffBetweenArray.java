package com.demotest;

public class MaxDiffBetweenArray {

	//Max difference between any adjacent index in array::
	public static void main(String[] args) {

		int[] a = { 1, 4, 8, 15, 17 }; // 3,4,7,2
		int diff = 0;

		for (int i = 0; i < a.length - 1; i++) {
			if (a[i + 1] - a[i] > diff) {
				diff = a[i + 1] - a[i];
			}
		}
		System.out.println(diff);

	}

}
