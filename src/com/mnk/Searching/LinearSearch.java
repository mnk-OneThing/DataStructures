package com.mnk.Searching;

public class LinearSearch {
	public static void main(String ar[]) {
		int a[] = { 1, 5, 8, 0, 66 };
		int findIndexofX = 8;
		System.out.println(linerSearch(a, findIndexofX));
	}

	private static int linerSearch(int[] a, int findIndexofX) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] == findIndexofX) {
				return i;
			}
		}
		return -1;
	}
}
