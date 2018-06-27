package internet.lambda.helloWorld;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Collection;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class LambdaHelloWorld {
    interface HelloWorld {
        public String printMessage(String msg);
    }

    public static void main(String[] args) throws IOException {
        HelloWorld helloWorld = (/*String*/ name)->("Hello2 " + name);
        System.out.println(helloWorld.printMessage("student"));
    }

    public void createStream() throws IOException {
//        https://habr.com/company/luxoft/blog/270383/
//        CREATE STREAM
        //1
        Collection<String> collection = Arrays.asList("a1", "a2", "a3");
        Stream<String> streamFromCollection = collection.stream();
        //2
        Stream<String> streamFromValues = Stream.of("a1", "a2", "a3");
        //3
        String[] array = {"a1","a2","a3"};
        Stream<String> streamFromArrays = Arrays.stream(array);
        //4
        Stream<String> streamFromFiles = Files.lines(Paths.get("file.txt"));
        //5
        IntStream streamFromString = "123".chars();
        //6
        Stream.builder().add("a1").add("a2").add("a3").build();
        //7
        Stream<String> stream = collection.parallelStream();
        //8
        Stream<Integer> streamFromIterate = Stream.iterate(1, n -> n + 1);
        //9
        Stream<String> streamFromGenerate = Stream.generate(() -> "a1");

//        Stream.
//        collection.
//        Arrays.
    }


}
