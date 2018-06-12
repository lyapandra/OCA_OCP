package internet.lambda.javabrains.unit1.unit1my;

/**
 * Created by a on 27.04.2018.
 */
public class Greeter03 {
    public static void main(String[] args) {
//        () -> System.out.println("HW 03");
        MyPrint f = () -> System.out.println("d");
        MyAdd a = (int c, int b) -> System.out.println("Total: " + c+b);
    }
}

interface MyPrint {
    void foo();
}

interface MyAdd {
    void foo(int a, int b);
}
