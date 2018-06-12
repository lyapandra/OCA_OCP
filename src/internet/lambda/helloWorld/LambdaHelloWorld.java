package internet.lambda.helloWorld;

public class LambdaHelloWorld {
    interface HelloWorld {
        public String printMessage(String msg);
    }

    public static void main(String[] args) {
        HelloWorld helloWorld = (/*String*/ name)->("Hello2 " + name);
        System.out.println(helloWorld.printMessage("student"));
    }
}
