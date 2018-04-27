package OCASelikoffGit.ch05_class_design.s01_class_inheritance.e04_defining_constructors.ee01;

/**
 * Chapter 5: Class Design<br>
 * Introducing Class Inheritance<br>
 * Defining Constructors - pages 238-240
 * <p>
 * this() and super() if used, must be the first statement in a constructor
 */
public class E1Animal {
	private int age;
	public E1Animal(int age) {
		super();  // call to the parent constructor defined in java.lang.Object
		this.age = age;
	}
}
