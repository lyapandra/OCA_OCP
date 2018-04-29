package JUGru.NonAdecvatInterView;

/**
 * Created by a on 03.04.2018.
 */
public class Q3 {
    public static void main(String[] args) {
    byte b = 1;
    action(b, b);
    }

    static void action(byte...args) {
        System.out.println("action(byte...args) ");
    }
    static void action1(long l1, short s1) {
        System.out.println("action(long l1, short s1)");
    }
    static void action(Byte b1, Byte b2) {
        System.out.println("(Byte b1, Byte b2)");
    }
}
