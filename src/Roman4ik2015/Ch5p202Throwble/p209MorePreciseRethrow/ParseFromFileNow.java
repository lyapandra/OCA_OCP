package Roman4ik2015.Ch5p202Throwble.p209MorePreciseRethrow;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

/**
 * Created by a on 08.04.2018.
 */
public class ParseFromFileNow {
    public double parseFromFileNow(String filename)
            throws FileNotFoundException, ParseException, IOException {
        NumberFormat nfFr = NumberFormat.getInstance(Locale.FRANCE);
        double numFr = 0;
        BufferedReader buff = null;
        try {
            FileReader fr = new FileReader(filename);
            buff = new BufferedReader(fr);
            String number = buff.readLine();
            numFr = nfFr.parse(number).doubleValue();
        } catch (final Exception e) { // final — необязателен
            throw e; // more precise rethrow
        } finally {
            if(buff != null) {
                buff.close();
            }
        }
        return numFr;
    }
    public static void main(String[] args) throws IOException, ParseException {
        ParseFromFileNow p = new ParseFromFileNow();
        p.parseFromFileNow("dsf");
    }
}
