package internet.lambda.SourceCode.u2;

public class Main {
    public static void main(String[] args) {

        Operation<Integer> addition = ((value1, value2) -> value1+value2);
        System.out.println("addition = " + addition.getResult(2,5));

        Operation<String> concat = ((value1, value2) -> value1 + value2);
        System.out.println("concat.getResult(\"st\", \"ring\") = " + concat.getResult("st", "ring"));

        Operation<String> concat2 = ((String value1, String value2) -> value1 + value2);
        System.out.println("concat.getResult(\"st\", \"ring\") = " + concat.getResult("st", "ring"));


//        Operation<?> plus = ((value1, value2) -> value1 + value2);
//        System.out.println("plus.getResult(\"st\", \"ring\") = " + plus.getResult("st", "ring"));

    }
}
