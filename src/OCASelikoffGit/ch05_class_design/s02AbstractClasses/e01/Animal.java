package OCASelikoffGit.ch05_class_design.s02AbstractClasses.e01;

/**
 * Chapter 5: Class Design<br>
 * Creating Abstract Classes<br>
 * pages 259-260
 */
public abstract class Animal {
	protected int age;
	public void eat() {
		System.out.println("Animal is eating");
	}
	public abstract String getName();
}
