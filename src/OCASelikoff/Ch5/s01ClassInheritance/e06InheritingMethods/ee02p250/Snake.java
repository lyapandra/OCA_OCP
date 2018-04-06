package OCASelikoff.Ch5.s01ClassInheritance.e06InheritingMethods.ee02p250;

/**
 * Created by a on 06.04.2018.
 */
public class Snake extends Reptile {
    protected boolean hasLegs() {
        return false;
    }
    protected double getWeight() throws InsufficientDataException{
        return 2;
    }
}