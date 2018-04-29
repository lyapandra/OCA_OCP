package lambda.javabrains.unit1;

public class Greeter {

    public void greet(Greeting greeting) {
        greeting.perform();
    }


    public static void main(String[] args) {
        Greeter greeter = new Greeter();

//		Greeting lambdaGreeting = () -> System.out.print("Greeting lambdaGreeting");

        Greeting innerClassGreeting = new Greeting() {
            @Override
            public void perform() {
                System.out.print("Hello world!");
            }
        };
//		greeter.greet(innerClassGreeting);
        //
        Greeting g = () -> System.out.println("g");
        greeter.greet(() -> System.out.println("greeter.greet"));
        MyLambda MyLambdaFunction = () -> System.out.println("MyLambda MyLambdaFunction = () -> System.out.println(\"greeter.greet\");");
        MyLambdaFunction.foo();
    }

    interface MyLambda {
        void foo();
    }
}



