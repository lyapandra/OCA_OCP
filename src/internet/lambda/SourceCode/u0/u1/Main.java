package internet.lambda.SourceCode.u0.u1;

public class Main {
    public static void main(String[] args) {

        Operation operation = new Operation() {
            @Override
            public double getResult(double value1, double value2) {
                return value1*value2;
            }
        };

        System.out.println("operation = " + operation.getResult(2,4));


    }
}
