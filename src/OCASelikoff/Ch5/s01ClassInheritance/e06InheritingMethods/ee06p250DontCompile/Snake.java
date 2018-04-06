package OCASelikoff.Ch5.s01ClassInheritance.e06InheritingMethods.ee06p250DontCompile;

/**
 * Created by a on 06.04.2018.
 */
public class Snake extends Reptile {
    protected boolean hasLegs() throws Exception  {
        return false;
    }
    protected double getWeight() throws InsufficientDataException{
        return 2;
    }
}