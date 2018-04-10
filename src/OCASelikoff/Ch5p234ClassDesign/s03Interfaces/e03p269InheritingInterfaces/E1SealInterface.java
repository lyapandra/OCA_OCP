package OCASelikoff.Ch5p234ClassDesign.s03Interfaces.e03p269InheritingInterfaces;

/**
 * Chapter 5: Class Design<br>
 * Implementing Interfaces<br>
 * Inheriting an Interface - pages 269-270
 * <p>
 * Any class that implements the Seal interface must provide an implementation for all methods
 * in the parent interfaces—in this case, getTailLength() and getNumberOfWhiskers().
 */
public interface E1SealInterface extends E1HasTail, E1HasWhiskers {
}
