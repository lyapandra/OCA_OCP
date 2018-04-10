package OCASelikoff.Ch5p234ClassDesign.s01ClassInheritance.e06InheritingMethods.ee05p254OverridingVsHidingMethods;
/**
 * Chapter 5: Class Design<br>
 * Introducing Class Inheritance<br>
 * Calling Inherited Class Members - Inheriting Methods - Overriding vs. Hiding Methods - pages 254-255
 * <p>
 * This example uses method overriding where the parent instance method isBiped() is overridden by the child class isBiped()
 */
public class E2Kangaroo extends E2Marsupial {
	public boolean isBiped() {
		return true;
	}
	public void getKangarooDescription() {
		System.out.println("Kangaroo hops on two legs: "+isBiped());
	}
	public static void main(String[] args) {
		E2Kangaroo joey = new E2Kangaroo();
		joey.getMarsupialDescription();  // isBiped() from child used outputting true
		joey.getKangarooDescription();   // isBiped() from child used outputting true
		System.out.println("joey.isBiped() = " + joey.isBiped());

		E2Marsupial m = new E2Marsupial();
		m.getMarsupialDescription();
		System.out.println("m.isBiped() = " + m.isBiped());
	}
}
