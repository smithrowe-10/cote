package ct.week03;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 디큐(Deque)
 */
public class Ex32 {
	public static void main(String[] args) {
		Deque<Integer> q = new LinkedList<>();
		q.add(1);
		q.add(2);
		q.offer(3);
		System.out.println(q.toString());
		q.addFirst(4);
		System.out.println(q.toString());
		System.out.println(q.peek());
		System.out.println(q.peekFirst());
		System.out.println(q.peekLast());
	}
}
