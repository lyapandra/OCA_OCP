package internet.lambda.annimon.u1;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class e1Operations {

    public static void main(String[] args) {
        differentOperation();
        System.out.println("\n");
        iterateOperation();
        System.out.println("\n");
        flatMapOperation();
    }

    static void differentOperation(){
//        E1CreateStream s = new E1CreateStream();
//        List<Integer> ss = s.CreateIntArrayStream();
        int rng = 10;
        IntStream.range(-rng,rng)
                .filter(x -> x>=-5)
                .map(y -> y+1)
                .limit(13)
                .forEach(System.out::print);
    }

    static void iterateOperation(){
//        java 9:
//        Stream.iterate(2, x -> x < 25. x - x+6);

        // java 8
        Stream.iterate(0, x->x+2)
                .limit(10)
                .forEach(System.out::print);
    }

    static void flatMapOperation(){
        Stream.of(2, 3, 0, 1, 3)
                .flatMapToInt(x -> IntStream.range(0, x))
                .forEach(System.out::println);
    }
}
