package OCASelikoff.Ch5p234ClassDesign.s01ClassInheritance.e06InheritingMethods.ee03p251RedeclaringPrivateMethods;

/**
 * Chapter 5: Class Design<br>
 * Introducing Class Inheritance<br>
 * Calling Inherited Class Members - Inheriting Methods - Redeclaring private Methods - pages 251-252
 */
public class BactrianCamel extends Camel {

	/* This is not an override of parent getNumberOfHumps() since parent accessibility is private.  This merely redeclares a method
	 * with the same name free of override rule requirements. */
	private int getNumberOfHumps() {
		return 2;
	}

	public static void main(String[] args) {
		BactrianCamel bc = new BactrianCamel();
		bc.getNumberOfHumps();
	}
}
