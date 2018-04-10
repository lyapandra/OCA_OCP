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
public class ParseFromFileBefore {
    public double parseFromFileBefore(String filename)
            throws FileNotFoundException, ParseException, IOException {
        NumberFormat nfFr = NumberFormat.getInstance(Locale.FRANCE);
        double numFr = 0;
        BufferedReader buff = null;
        try {
            FileReader fr = new FileReader(filename);
            buff = new BufferedReader(fr);
            String number = buff.readLine();
            numFr = nfFr.parse(number).doubleValue();
            System.out.println("try");
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException");
            throw e;
        } catch (IOException e) {
            System.out.println("IOException");
            throw e;
        } catch (ParseException e) {
            System.out.println("ParseException");
            throw e;
        } finally {
            if(buff != null) {
                System.out.println("finally");
                buff.close();
            }
        }
        return numFr;
    }

    public static void main(String[] args) throws IOException, ParseException {
        ParseFromFileBefore p = new ParseFromFileBefore();
        p.parseFromFileBefore("dsf");
    }

}
