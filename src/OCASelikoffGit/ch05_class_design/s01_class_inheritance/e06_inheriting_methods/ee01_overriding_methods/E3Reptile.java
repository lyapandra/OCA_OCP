package OCASelikoffGit.ch05_class_design.s01_class_inheritance.e06_inheriting_methods.ee01_overriding_methods;

/**
 * Chapter 5: Class Design<br>
 * Introducing Class Inheritance<br>
 * Calling Inherited Class Members - Inheriting Methods - Overriding a Method - page 250
 */
public class E3Reptile {
	protected boolean hasLegs() throws E3InsufficientDataException {
		throw new E3InsufficientDataException();
	}
	protected double getWeight() throws Exception {
		return 2;
	}
}
