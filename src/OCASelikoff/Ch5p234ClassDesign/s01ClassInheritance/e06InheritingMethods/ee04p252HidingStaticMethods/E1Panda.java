package OCASelikoff.Ch5p234ClassDesign.s01ClassInheritance.e06InheritingMethods.ee04p252HidingStaticMethods;

/**
 * Chapter 5: Class Design<br>
 * Introducing Class Inheritance<br>
 * Calling Inherited Class Members - Inheriting Methods - Hiding Static Methods - pages 252-253
 */
public class E1Panda extends E1Bear {
	public static void eat() {
		System.out.println("Panda bear is chewing");
	}
	public static void main(String[] args) {
		E1Panda p = new E1Panda();
		p.eat();
		E1Panda.eat();
		E1Bear.eat();
	}
}
