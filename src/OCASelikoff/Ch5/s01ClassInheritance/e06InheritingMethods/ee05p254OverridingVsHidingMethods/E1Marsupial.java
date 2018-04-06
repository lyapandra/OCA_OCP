package OCASelikoff.Ch5.s01ClassInheritance.e06InheritingMethods.ee05p254OverridingVsHidingMethods;
/**
 * Chapter 5: Class Design<br>
 * Introducing Class Inheritance<br>
 * Calling Inherited Class Members - Inheriting Methods - Overriding vs. Hiding Methods - pages 254-255
 * <p>
 * This example uses method hiding where the parent static method isBiped() is hidden by the child class isBiped()
 */
public class E1Marsupial {
	public static boolean isBiped() {
		return false;
	}
	public void getMarsupialDescription() {
		System.out.println("Marsupial walks on two legs: " + isBiped());
	}
}
