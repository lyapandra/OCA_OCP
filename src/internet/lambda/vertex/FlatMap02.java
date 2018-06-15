package internet.lambda.vertex;

import java.util.Arrays;

public class FlatMap02 {
    public static void main(String[] args) {
        int[][] arr = {{1, 2}, {3, 4}, {5, 6}};

        int[] newArr = Arrays.stream(arr)
                .flatMapToInt(i -> Arrays.stream(i)) //преобразовываем IntStream<int[]> в IntStream
                .toArray(); // преобразовываем IntStream в int[]

        System.out.println(Arrays.toString(newArr)); //output [1, 2, 3, 4, 5, 6]
    }
}
