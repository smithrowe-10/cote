package ct.week03;

import java.util.Collections;
import java.util.PriorityQueue;

/**
 * 우선순위큐(PriorityQueue)
 */
public class Ex33 {
	public static void main(String[] args) {
		PriorityQueue<Integer> q1 = new PriorityQueue<>();//오름차순
		PriorityQueue<Integer> q2 = new PriorityQueue<>(Collections.reverseOrder());//내림차순
		
		q1.add(1);
		q1.add(10);
		q1.add(8);
		q1.add(17);
		q1.add(25);
		q1.add(16);
		q1.add(7);
		
		System.out.println(q1.toString());
		
		q2.add(1);
		q2.add(10);
		q2.add(8);
		q2.add(17);
		q2.add(25);
		q2.add(16);
		q2.add(7);
		
		System.out.println(q2.toString());
		
	}
}
