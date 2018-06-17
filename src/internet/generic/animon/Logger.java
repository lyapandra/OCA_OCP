package internet.generic.animon;

import java.util.Arrays;
import java.util.List;

public class Logger {

    public static void main(String[] args) {
        List<Number> numbers = Arrays.asList(0, 0.5, 12.3, 30, 450);
//        Erroe
        Logger.print(numbers);

        List<Object> objects = Arrays.asList("string", new Object[5], null, 15);
        Logger.print(objects);
    }

    public static void print(List<?> list) {
//    public static void print(List<Object> list) {
        for (Object object : list) {
            log(object);
        }
    }

    private static void log(Object obj) {
        System.out.print(System.currentTimeMillis());
        System.out.print(": ");
        if (obj == null) {
            System.out.println("<null>");
        } else {
            System.out.print(obj.getClass().getName());
            System.out.print('\t');
            System.out.println(obj.toString());
        }
    }
}