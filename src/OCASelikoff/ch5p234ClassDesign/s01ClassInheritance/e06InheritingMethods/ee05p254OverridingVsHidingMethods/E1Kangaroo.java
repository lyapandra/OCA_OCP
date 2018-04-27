package OCASelikoff.ch5p234ClassDesign.s01ClassInheritance.e06InheritingMethods.ee05p254OverridingVsHidingMethods;

/**
 * Chapter 5: Class Design<br>
 * Introducing Class Inheritance<br>
 * Calling Inherited Class Members - Inheriting Methods - Overriding vs. Hiding Methods - pages 254-255
 * <p>
 * This example uses method hiding where the parent static method isBiped() is hidden by the child class isBiped()
 */
public class E1Kangaroo extends E1Marsupial {
	public static boolean isBiped() {
		return true;
	}
	public void getKangarooDescription() {
		System.out.println("Kangaroo hops on two legs: " + isBiped());
	}
	public static void main(String[] args) {
		E1Kangaroo joey = new E1Kangaroo();
		joey.getMarsupialDescription();  // isBiped() from parent used outputting false
		joey.getKangarooDescription();   // isBiped() from child used outputting true
	}
}
