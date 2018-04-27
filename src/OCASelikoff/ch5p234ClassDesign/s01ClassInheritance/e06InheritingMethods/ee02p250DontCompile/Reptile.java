package OCASelikoff.ch5p234ClassDesign.s01ClassInheritance.e06InheritingMethods.ee02p250DontCompile;

/**
 * Created by a on 06.04.2018.
 */
public class Reptile {
    protected boolean hasLegs() throws InsufficientDataException {
        throw new InsufficientDataException();
    }
    protected double getWeight() {
        return 2;
    }
}
