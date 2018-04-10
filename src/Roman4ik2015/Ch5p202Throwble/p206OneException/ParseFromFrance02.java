package Roman4ik2015.Ch5p202Throwble.p206OneException;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

/**
 * Created by a on 08.04.2018.
 */
public class ParseFromFrance02 {
    public double parseFromFrance(String numberStr) throws ParseException {
        NumberFormat nfFr = NumberFormat.getInstance(Locale.FRANCE);
        double numFr = nfFr.parse(numberStr).doubleValue();
        return numFr;
    }

    public static void main(String[] args) {
        ParseFromFrance02 p = new ParseFromFrance02();
        try {
            System.out.println(p.parseFromFrance("12345"));
        } catch (ParseException e) {
            System.out.println("catch (ParseException e) 1");
            e.printStackTrace();
        }
        try {
            System.out.println(p.parseFromFrance("Z12345"));
        } catch (ParseException e) {
            System.out.println("catch (ParseException e) 2");
            System.out.println(e);
            e.printStackTrace();
        }
    }
}

