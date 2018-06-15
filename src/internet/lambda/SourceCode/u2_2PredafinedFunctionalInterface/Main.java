package internet.lambda.SourceCode.u2_2PredafinedFunctionalInterface;

import java.util.ArrayList;
import java.util.function.*;
// https://user12vv.wordpress.com/2018/05/08/java-8-%D0%B8-%D1%84%D1%83%D0%BD%D0%BA%D1%86%D0%B8%D0%BE%D0%BD%D0%B0%D0%BB%D1%8C%D0%BD%D1%8B%D0%B5-%D0%B8%D0%BD%D1%82%D0%B5%D1%80%D1%84%D0%B5%D0%B9%D1%81%D1%8B/

public class Main {
    public static void main(String[] args) {
        System.out.println("PREDICATE\nboolean test(T t)");
        Predicate<Integer> integerPredicate = i -> (i==8);
        System.out.println("predicate.test(8) = " + integerPredicate.test(8));

        Predicate<String> stringPredicate = st -> st.equals("hi");
        System.out.println("stringPredicate.test(\"hi\") = " + stringPredicate.test("hi"));
        System.out.println("stringPredicate.test(\"nohi\") = " + stringPredicate.test("nohi"));

        Predicate<ArrayList> arrayListPredicate = arr -> arr.isEmpty();
        ArrayList<String> s = new ArrayList<>();
        s.add("a");
        s.add("b");
        System.out.println("s = " + s);
        System.out.println("arrayListPredicate.test(new ArrayList<String>()) = " + arrayListPredicate.test(s));

        System.out.println("\nCONSUMER\nvoid accept(T t)");
        Consumer<String > c1 = c -> System.out.println("c1 = " + c);
        c1.accept("5");

        Consumer<Integer> c2 = c -> System.out.println("c2 = " + c);
        c2.accept(5);

        System.out.println("\nFUNCTION\nR apply(T t)");
        Function<String,Integer> f1 = (s1 -> s1.length());
        System.out.println("f1 = " + f1.apply("12345"));

        System.out.println("\nSUPPLIER\nT get();");
        Supplier<String> supplier1 = () -> "String";
        System.out.println("supplier1.get() = " + supplier1.get());

        System.out.println("\nUnaryOperator\n THE SAME: R apply(T t)\nUnaryOperator<T> identity()???");
        UnaryOperator <String> uo1 = ou1str -> ou1str.toLowerCase();
        System.out.println("uo1.apply(\"DaD\") = " + uo1.apply("DaD"));
        UnaryOperator <Integer> uo2 = ou2int -> ou2int*2;
        System.out.println("uo2.apply(2) = " + uo2.apply(2));
        UnaryOperator <Double> sqrt = dbl -> dbl*2;
        System.out.println("sqrt.apply(2.2) = " + sqrt.apply(2.2));

        System.out.println("BinaryOperator\n BinaryOperator<T> extends BiFunction<T,T,T>\nR apply(T t, U u)");
        BinaryOperator<String> binaryOperator01 = (bo1,bo2) -> bo1 + bo2;
        System.out.println("binaryOperator01.apply(\"One \",\"Two \") = " + binaryOperator01.apply("One ", "Two "));

    }
}
