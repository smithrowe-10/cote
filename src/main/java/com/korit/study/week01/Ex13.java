package com.korit.study.week01;

import java.util.*;

/**
 * 배열 정렬
 */
public class Ex13 {
	public static void main(String[] args) {
		int[] arr = new int[] {10, 4, 2, 7, 6, 1, 8};
		int[] arr2 = new int[] {10, 4, 2, 7, 6, 1, 8};
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		Arrays.sort(arr2, 3, 6);
		System.out.println(Arrays.toString(arr2));
	}
}
