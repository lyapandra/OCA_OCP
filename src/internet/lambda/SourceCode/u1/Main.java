package internet.lambda.SourceCode.u1;

public class Main {
    private static double v1 = 3.0;

    public static void main(String[] args) {

        Operation operation = new Operation() {
            @Override
            public double getResult(double value1, double value2) {
                return value1 * value2;
            }
        };
        System.out.println("operation = " + operation.getResult(2, 4));

        Operation lambda = (value1, value2) -> value1 * value2;
        System.out.println("lambda.getResult(2.0,3.2) = " + lambda.getResult(2.0, 3.2));

        Operation lambdaInt = ((value1, value2) -> value1 * value2);
        System.out.println();
        System.out.println("lambdaInt.getResult(2.0,2.0) = " + lambdaInt.getResult(2.0, 2.0));

        Printer printer = string -> System.out.println("string = " + string);
        printer.prinln("hello");

        Factorial factorial = value -> {
            int result = 1;
            for (int i = 1; i <= value; i++) {
                result *= i;
            }
            return result;
        };
        System.out.println("factorial = " + factorial.getResult(4));

        NoArguments noArguments = () -> v1;
        System.out.println("noArguments = " + noArguments.getResult());
    }
}
