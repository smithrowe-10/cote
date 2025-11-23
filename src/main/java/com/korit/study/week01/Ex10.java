package com.korit.study.week01;
/**
 * 문자열(String)
 */
public class Ex10 {
	public static void main(String[] args) {
		String s = "Good Morning!";
		String s1 = "ABCDabcd123";
		
		System.out.println("charAt :" + s.charAt(5));
		System.out.println("startsWith :" + s.startsWith("good"));
		System.out.println("endsWith :" + s.endsWith("ng!"));
		System.out.println("equals :" + s.equals("good Morning!")); 
		System.out.println("indexOf :" + s.indexOf("n"));
		System.out.println("lastIndexOf :" + s.lastIndexOf("n"));
		System.out.println("length :" + s.length());
		
		System.out.println("replace :" + s.replace("Good", "good"));
		System.out.println("replace :" + s.replace("o", "a"));
		System.out.println("replaceFirst :" + s.replaceFirst("o", "a"));
		
		System.out.println("replaceAll :" + s.replaceAll("Good", "good"));
		System.out.println("replaceAll :" + s.replaceAll("o", "a"));
		System.out.println("replaceAll :" + s.replaceAll("[Good]", "a"));
		System.out.println("replaceAll :" + s1.replaceAll("[0-9]", ""));
		System.out.println("replaceAll :" + s1.replaceAll("[^0-9]", ""));
		System.out.println("replaceAll :" + s1.replaceAll("^[AB]", ""));
		System.out.println("replaceAll :" + s1.replaceAll("[0-9]$", ""));
		System.out.println("replaceAll :" + s1.replaceAll("[A]$", ""));
		
	}
	
}
