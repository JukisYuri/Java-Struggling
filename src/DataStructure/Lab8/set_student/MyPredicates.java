package DataStructure.Lab8.set_student;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Predicate;

public class MyPredicates {
	// Remove every object, obj, from coll for which p.test(obj)
	// is true. (This does the same thing as coll.removeIf(p).)
	public static <T> void remove(Collection<T> coll, Predicate<T> p) {
		
		Iterator<T> iter = coll.iterator();
		while(iter.hasNext()) {
			T next = iter.next();
			if(p.test(next))
				iter.remove();
			// xoá các phần tử thoả mãn điều kiện p
		}
	}

	// Remove every object, obj, from coll for which
	// pr.test(obj) is false. (That is, retain the
	// objects for which the predicate is true.)
	public static <T> void retain(Collection<T> coll, Predicate<T> p) {
		Iterator<T> result = coll.iterator();
		while(result.hasNext()){
			T next = result.next();
			if(!p.test(next)){
				result.remove();
				// giữ các phần tử thoả mãn điều kiện p
			}
		}
	}

	// Return a Set that contains all unique objects, obj,
	// from the collection, coll, such that p.test(obj)
	// is true.
	public static <T> Set<T> collect(Collection<T> coll, Predicate<T> p) {
		Set<T> result = new HashSet<>();
		for(T t_coll : coll){
			if(p.test(t_coll)){
				result.add(t_coll);
			}
		}
		return result;
	}

	// Return the index of the first item in list
	// for which the predicate is true, if any.
	// If there is no such item, return -1.
	public static <T> int find(Collection<T> coll, Predicate<T> p) {
		Iterator<T> result = coll.iterator();
		int index = 0;
		while(result.hasNext()){
			T next = result.next();
			if(p.test(next)){
				return index;
			}
			index++;
		}
		return -1;
	}
}
