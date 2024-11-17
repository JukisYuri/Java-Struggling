package DataStructure.Lab8.set_student;

import java.util.*;

public class TestPredicates {
	public static void main(String[] args) {
		Set<Integer> list = new HashSet<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		System.out.println("Before: "+list);
		MyPredicates.remove(list, new Even());
		System.out.println("After: "+list);
		list.clear();

		Collections.addAll(list, 1,2,3,4,5);
		MyPredicates.retain(list, new Even());
		System.out.println("Retain: " + list);
		list.clear();

		Set<Integer> listSet = new HashSet<>();
		Collections.addAll(listSet, 1, 2, 3, 4, 5);
		Set<Integer> collected = MyPredicates.collect(listSet, new Even());  // Lưu kết quả vào biến mới
		System.out.println("Collect: " + collected);
		list.clear();

		Collections.addAll(list, 1, 2, 3, 4, 5);
		int index = MyPredicates.find(list, new Even());
		if (index != -1) {
			System.out.println("Find: The first even number is at index " + index + " with value " + list.toArray()[index]);
		} else {
			System.out.println("Find: No even number found.");
		}
		list.clear();
	}
}
