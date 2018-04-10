package OCASelikoff.Ch5p234ClassDesign.s01ClassInheritance.e07p257InheritingVariables;

/**
 * Chapter 5: Class Design<br>
 * Introducing Class Inheritance<br>
 * Calling Inherited Class Members - Inheriting Variables - Hiding Variables - pages 257-258
 */
public class E1Rodent {
	protected  int tailLength = 4;
	public void getRodentTails() {
		System.out.println("[parentTail=" + tailLength + "]");
	}
}
