package JUGru.NonAdecvatInterView;

/**
 * Created by a on 03.04.2018.
 https://www.youtube.com/watch?v=AR9dtVaEUSM
 */
public class Q4 {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "hel";
        final String s22 = "hel";
        String s3 = "lo";
        String s4 = "hello";

        System.out.println("Q4.main");
        System.out.println(s1==s4);
        System.out.println(s1==s2+s3);
        System.out.println(s1==s22+s3);
        System.out.println(s1==s2+"lo");
        System.out.println(s1==s22+"lo");

    }

}
