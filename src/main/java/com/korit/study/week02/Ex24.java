package com.korit.study.week02;


import java.util.HashSet;
import java.util.Set;

/**
 * Set
 */
public class Ex24 {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("Java");
		set.add("Spring");
		set.add("Mybatis");
		set.add("Oracle");
		set.add("Java");
		System.out.println(set.toString());
		for(String s : set) {
			System.out.println(s);
		}
		
		set.remove("Oracle");
		System.out.println(set.toString());
		System.out.println(set.size());
		System.out.println(set.isEmpty());
		System.out.println(set.contains("java"));
		
	}
}
