package DataStructure.Lab8.set_student;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
	}
}
