package OCASelikoff.Ch5p234ClassDesign.s03Interfaces.e05p271AbstractMethodsMultipleInheritance;
/**
 * Chapter 5: Class Design<br>
 * Implementing Interfaces<br>
 * Abstract Methods and Multiple Inheritance - page 271
 */
public class E1Bear implements E1Herbivore, E1Omnivore {
	public void eatMeat() {
		System.out.println("Eating meat");
	}
	public void eatPlants() {  // satisfies the implementation requirement for eatPlant() mandated by both interfaces
		System.out.println("Eating plants");
	}
}
