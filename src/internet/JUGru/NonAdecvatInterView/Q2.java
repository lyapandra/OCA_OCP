package JUGru.NonAdecvatInterView;

/**
 * Created by a on 03.04.2018.
 */
public class Q2 {
    public static void main(String[] args) {
        String string = "Hi";
        String string1 = "Hi";
        StringBuilder stringBuilder = new StringBuilder("Hi");
        StringBuilder stringBuilder2 = new StringBuilder("Hi");
//         #1
//        System.out.println(string == stringBuilder);
//        #2
        System.out.println(string.equals(stringBuilder));
        System.out.println(string.equals(string1));
//        #3
        System.out.println(stringBuilder2.equals(stringBuilder));
            }
}
