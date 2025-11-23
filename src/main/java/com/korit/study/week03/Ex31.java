package com.korit.study.week03;


import java.util.LinkedList;
import java.util.Queue;

/**
 * 큐(Queue)
 */
public class Ex31 {
	public static void main(String[] args) {
		Queue<String> q = new LinkedList<>();
		q.add("A");
		q.add("B");
		q.offer("C");
		q.offer("D");
		System.out.println(q.toString());
		System.out.println(q.peek());
		System.out.println(q.toString());
		System.out.println(q.poll());
		System.out.println(q.toString());
		System.out.println(q.isEmpty());
		System.out.println(q.size());
		System.out.println(q.remove());
		System.out.println(q.remove("D"));
		System.out.println(q.toString());
	}
}
