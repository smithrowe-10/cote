package com.korit.study.week01;

import java.util.Arrays;

/**
 * 배열
 */
public class Ex12 {
	public static void main(String[] args) {
		//1차원 배열
		int[] a;
		int b[];
		
		a = new int[5]; //기본값 0;
		
		char[] ch = {'A', 'B', 'C'};
		
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(ch));
		for(int i = 0; i < ch.length; i++) {
			System.out.print(ch[i]);
		}
		System.out.println();
		ch[2] = 'D';
		System.out.println(Arrays.toString(ch));
		
		//2차원배열
		int[][] a2;
		int b2[][];
		int[] c2[];
		int[][] d2 = {{1,2},{3,4},{5,6}};
		System.out.println(d2.length);//행의 갯수
		System.out.println(d2[0].length); //해당행의 열의 갯수
		
		int[][] e2 = {{1,2}, {3,4,5}, {6,7,8,9}};
		for(int i = 0; i < e2.length; i++) {
			System.out.println(e2[i].length);
		}
		
		int[][] f2 = new int[][] {{1,2},{3,4}};
	}
}
