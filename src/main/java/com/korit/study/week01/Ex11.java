package com.korit.study.week01;
/**
 * 비교
 */
public class Ex11 {
	public static void main(String[] args) {
		int i1 = 0, i2 = 0;
		System.out.println(i1 == i2);
		char c1 = 'A', c2 = 'A';
		System.out.println(c1 == c2);
		
		String s1 = "A", s2 = "A";
		System.out.println(s1 == s2);
		
		String s3 = new String("A");
		String s4 = new String("A");
		System.out.println(s3 == s4);
		System.out.println(s1 == s3);
		
		System.out.println(s1.equals(s4));
	}
}
