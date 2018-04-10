package Roman4ik2015.Ch5p202Throwble.p206OneException;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

/**
 * Created by a on 08.04.2018.
 */
public class ParseFromFrance01 {
    public double parseFromFrance(String numberStr) {
        NumberFormat nfFr = NumberFormat.getInstance(Locale.FRANCE);
        try {
            double numFr = nfFr.parse(numberStr).doubleValue();
            return numFr;
        } catch (ParseException e) { // проверяемое исключение
// 1. генерация стандартного исключения, н-р: IllegalArgumentException() — не очень хорошо
// 2. генерация собственного исключения
// 3. return 0 или другого значения по умолчанию; — нежелательно
            return 1.;
        }
//        return 0.;
    }

    public static void main(String[] args) {
        ParseFromFrance01 p = new ParseFromFrance01();
        System.out.println(p.parseFromFrance("12345"));
        System.out.println(p.parseFromFrance("Z12345"));
    }
}

