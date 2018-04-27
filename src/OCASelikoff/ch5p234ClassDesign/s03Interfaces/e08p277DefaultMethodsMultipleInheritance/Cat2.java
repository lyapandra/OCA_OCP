package OCASelikoff.ch5p234ClassDesign.s03Interfaces.e08p277DefaultMethodsMultipleInheritance;
/**
 * Chapter 5: Class Design<br>
 * Implementing Interfaces<br>
 * Default Methods and Multiple Inheritance - pages 277-278
 * <p>
 * Both Walk and Run interfaces have a default method getSpeed().  This class compiles because it removes the ambiguity
 * of the apparent multiple inheritance by locally defining the getSpeed() method.  Same holds for abstract classes.
 */
public class Cat2 implements Walk, Run {
	public int getSpeed() {
		return 1;
	}
	public static void main(String[] args) {
		System.out.println(new Cat2().getSpeed());
	}
}

abstract class Cat3 implements Walk, Run {
	public int getSpeed() {
		return 1;
	}
	public static void main(String[] args) {
		System.out.println(new Cat2().getSpeed());
	}
}
