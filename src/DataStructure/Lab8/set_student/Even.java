package DataStructure.Lab8.set_student;

import java.util.function.Predicate;

public class Even implements Predicate<Integer> {
	public boolean test(Integer i) {
		return (i % 2 == 0);
	}
}