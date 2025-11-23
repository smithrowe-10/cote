package com.korit.study.week01;
/**
 * 반복문 for
 */
public class Ex06 {
	public static void main(String[] args) {
		//구구단 세로형
		/*
		 * 2 X 1 = 2
		 * --------------
		 * 
		 * 
		 * 9 X 9 = 81
		 */
		for(int i = 2; i <= 9; i++) {
			for(int j = 1; j <= 9; j++) {
				System.out.printf("%d X %d = %d\n", i, j, i * j);
			}
			System.out.println("---------------------");
		}
		
		//구구단 가로형
		/*
		 * 2 X 1 = 2   3 X 1 = 3                       9 X 1 = 9
		 */
		for(int i = 1; i <= 9; i++) {
			for(int j = 2; j <= 9; j++) {
				System.out.printf("%d X %d = %-2d  ", j, i, i * j);
			}
			System.out.println();
		}
	}
}
