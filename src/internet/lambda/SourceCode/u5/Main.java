package internet.lambda.SourceCode.u5;

import OCPSelikoff.chapter4.stream.StreamCreating;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Stream<String> stringStream = Arrays.stream(new String[]{"a", "b", "c"});
        stringStream.forEach(System.out::println);

        IntStream intStream = IntStream.of(1,2,3);
        intStream.forEach(System.out::println);

        DoubleStream doubleStream = DoubleStream.of(1.0,2.0,3.0);
        doubleStream.forEach(System.out::println);

        ArrayList<String> names = new ArrayList<>();
        Collections.addAll(names,"One", "Twos", "Three");
        names.stream().filter(name -> name.length() >= 4).forEach(System.out::println);

        IntStream intStream1 = IntStream.range(1,10);
        intStream1.forEach(System.out::println);

        System.out.println("\nRange");
        int range = 10;
        IntStream intStream2 = IntStream.range(-range,range);
        intStream2.forEach(System.out::println);

//        IntStream intStream3 = IntStream.iterate()
        IntStream intStream3 = IntStream.iterate()
    }
}
