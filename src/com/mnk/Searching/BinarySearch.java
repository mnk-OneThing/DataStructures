package com.mnk.Searching;

import java.util.Collections;

public class BinarySearch {

	public static void main(String[] args) {
		int a[] = { 11, 21, 32, 43, 58, 61, 99, 101, 245, 350 };
		int findIndexOf = 245;
		System.out.println(binarySearch(a, findIndexOf));
	}

	private static int binarySearch(int[] a, int findIndexOf) {
		int p = 0, r = a.length-1,q=0;
		while (p <= r) {
			 q = (p + r) / 2;
			if (a[q] == findIndexOf) {
				return q;
			} else if (a[q] > findIndexOf) {
					r=q-1;
			} else {
					p=q+1; 
			}
		}
		return -1;
	}
}
