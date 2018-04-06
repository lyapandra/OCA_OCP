package OCASelikoff.Ch5.s01ClassInheritance.e06InheritingMethods.ee02p249;
/**
 * Created by a on 06.04.2018.
 */

public class BactrianCamel extends Camel {
//    private int getNumberOfHumps() { // DOES NOT COMPILE
    protected String getNumberOfHumps() { //  COMPILE
        return String.valueOf(2);
    }
}