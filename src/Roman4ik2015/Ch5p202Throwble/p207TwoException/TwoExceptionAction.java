package Roman4ik2015.Ch5p202Throwble.p207TwoException;

/**
 * Created by a on 08.04.2018.
 */
public class TwoExceptionAction {
    public void doAction() {
        try {
            int a = (int)(Math.random() * 2);
            System.out.println("a = " + a);
            int c[] = { 1/a }; // опасное место #1
            c[a] = 71; // опасное место #2
        } catch(ArithmeticException e) {
            System.err.println("деление на 0" + e);
        } catch(ArrayIndexOutOfBoundsException e) {
            System.err.println("out of bound: " + e);
        } // окончание try-catch блока
        System.out.println("after try-catch");
    }

    public static void main(String[] args) {
        TwoExceptionAction t = new TwoExceptionAction();
        t.doAction();
    }
}