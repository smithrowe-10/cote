package com.korit.study.week01;
/**
 * 연산자
 */
public class Ex03 {
	public static void main(String[] args) {
		int a = 3, b = 4;
		//산술연산자
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		System.out.print(a % b);
		System.out.println("==============================");
		System.out.println(a++);
		System.out.println(++a);
		System.out.println(++b);
		System.out.println(b++);
		System.out.println(a > b ? "T" : "F");
		
		//논리 + 관계연산자
		//&&, || , !
		if(a > b) System.out.println("T");
		if(a != b) System.out.println("F");
		if(a > 0 && b < 2) System.out.println();
		if(a > 0 || b > 0) System.out.println();
		
		//비트연산자
		int i = 1, j = 2;
		System.out.println(i&j);
		System.out.println(i|j);
		System.out.println(i^j);
		
		//비트 시프트
		System.out.println(i<<1);
		System.out.println(i>>1);
		System.out.println(i>>>1);
	}
}
