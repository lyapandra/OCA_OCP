package OCPSelikoff.chapter3.search_and_sort;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by a on 12.04.2018.
 */
public class p105 {
    public static void main(String[] args) {
        int[] numbers = {6,9,1,8};
        Arrays.sort(numbers); // 1 6 8 9
        System.out.println("Arrays.binarySearch(numbers, 6) = " + Arrays.binarySearch(numbers, 6));
        System.out.println("Arrays.binarySearch(numbers, 0) = " + Arrays.binarySearch(numbers, 0));
        System.out.println("Arrays.binarySearch(numbers, 3) = " + Arrays.binarySearch(numbers, 3));
        System.out.println("Arrays.binarySearch(numbers, 7) = " + Arrays.binarySearch(numbers, 7));
        System.out.println("Arrays.binarySearch(numbers, 10) = " + Arrays.binarySearch(numbers, 10));
        System.out.println("Arrays.binarySearch(numbers, 11) = " + Arrays.binarySearch(numbers, 11));

        List<Integer> list = Arrays.asList(9,7,5,3);
        Collections.sort(list); // [3, 5, 7, 9]
        System.out.println(Collections.binarySearch(list, 3)); // 0
        System.out.println(Collections.binarySearch(list, 2)); // -1
    }
}
