package lambda.javabrains.unit1.unit1my;

/**
 * Created by a on 27.04.2018.
 */
public class Greeter02 {

    public void greet(Greeting greeting) {
        greeting.perform();
    }


    public static void main(String[] args) {
        Greeter02 greeter = new Greeter02();
        HelloWorldGreeting helloWorldGreeting = new HelloWorldGreeting();
        greeter.greet(helloWorldGreeting);
        SimpleGreeting simpleGreeting = new SimpleGreeting();
        greeter.greet(simpleGreeting);
//        greetingFunction = () -> System.out.println("HW 03");
//        addF = (int a, int b) -> a+b;
    }
}