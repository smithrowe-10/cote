package ct.week02;

import java.util.ArrayList;
import java.util.List;

/**
 * 리스트(ArrayList)
 */
public class Ex21 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Java");
		list.add("Spring");
		list.add("Mybatis");
		System.out.println(list.toString());
		list.add(2, "Oracle");
		System.out.println(list.toString());
		list.set(3, "MySQL");
		System.out.println(list.toString());
		list.add("Mybatis");
		list.add("Mybatis");
		list.remove(0);
		System.out.println(list.toString());
		list.remove("Mybatis");
		System.out.println(list.toString());
		System.out.println(list.isEmpty());
		System.out.println(list.size());
		list.clear();
		System.out.println(list.toString());
	}
}
