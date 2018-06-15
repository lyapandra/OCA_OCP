package internet.lambda.SourceCode.u1;

public class Main01 {

    private static double v1 = 2.0, v2 = 3.0;

    public static void main(String[] args) {

        OperationNoParameters operation = () -> v1 + v2;
        System.out.println("operation.getResult() = " + operation.getResult());
        System.out.println("v1 = " + v1);
        System.out.println("v2 = " + v2);
    }
}
