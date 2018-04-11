package OCPSelikoff.chapter1.nested_classes.staticnestedclass;

/**
 * Created by Serhii K. on 2/1/2016.
 */
public class Enclosing {

    static class Nested {
        private int price = 6;
    }

    public static void main(String[] args) {
        Nested nested = new Nested();
        System.out.println(nested.price);
    }
}

class MyClass{
    public static void main(String[] args) {
        Enclosing.Nested nested = new Enclosing.Nested();
        // System.out.println(nested.price);
    }
}
