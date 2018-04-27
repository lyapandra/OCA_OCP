package OCASelikoffGit.ch03_core_java_apis.e20_sorting_arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Chapter 3: Core Java APIs<br>
 * Understanding an ArrayList<br>
 * Sorting ArrayList - page 138
 */
public class SortingArrayList {
	public static void main(String... args) {
		List<Integer> numbers = new ArrayList<>();
		numbers.add(99);
		numbers.add(5);
		numbers.add(81);
		Collections.sort(numbers);
		System.out.println(numbers);  // [5, 81, 99]
	}
}
