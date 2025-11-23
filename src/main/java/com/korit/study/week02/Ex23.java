package ct.week02;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * ArrayList, LinkedList 비교
 */
public class Ex23 {
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<>();
		List<String> list2 = new LinkedList<>();
		long startTime, endTime;
		startTime = System.nanoTime();
		for(int i = 0; i < 100; i++) {
			list1.add(String.valueOf(i));
		}
		for(int i = 100; i < 100000; i++) {
			list1.add(50, String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("ArrayList : " + (endTime - startTime) + " ns");
		
		startTime = System.nanoTime();
		for(int i = 0; i < 100; i++) {
			list2.add(String.valueOf(i));
		}
		for(int i = 100; i < 100000; i++) {
			list2.add(50, String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("LinkedList : " + (endTime - startTime) + " ns");
	}
}
