package JUGru.NonAdecvatInterView.q10.q10b;

import JUGru.NonAdecvatInterView.q10.q10a.A;

/**
 * Created by a on 03.04.2018.
 */
public class B extends A {
    public void process(A a) {
//        a.i = a.i*2;
    }
    public static void main(String[] args) {
        A a = new B();
        B b = new B();
        b.process(a);
        System.out.println( a.getI() );
    }
}
