package OCASelikoff.Ch5.p249;

/**
 * Created by a on 06.04.2018.
 */

public class BactrianCamel extends Camel {
//    private int getNumberOfHumps() { // DOES NOT COMPILE
    protected String getNumberOfHumps() { // DOES NOT COMPILE
        return String.valueOf(2);
    }
}