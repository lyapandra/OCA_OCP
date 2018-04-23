package OCPSelikoff.chapter3.generics.golova4YouTube;

/**
 * Created by a on 23.04.2018.
 * @author https://www.youtube.com/watch?v=kQpuIm2nWuY
 */
public class Test {
    public static void main(String[] args) {
        f(new A());
        f(new B());
    }
    public static void f(A args) {
        System.out.println("args.getName() = " + args.getName());
    }

    public static void f(B args) {
        System.out.println("args.getName() = " + args.getName());
    }
}

class A {
    String getName (){
        return "A";
    }
}

//class B {
//    String getName (){
//        return "B";
//    }
//}

class B extends A {
    @Override
    String getName (){
        return "B";
    }
}
