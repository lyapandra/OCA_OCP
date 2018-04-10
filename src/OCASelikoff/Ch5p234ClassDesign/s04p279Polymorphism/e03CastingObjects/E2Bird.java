package OCASelikoff.Ch5p234ClassDesign.s04p279Polymorphism.e03CastingObjects;

/**
 * Chapter 5: Class Design<br>
 * Understanding Polymorphism<br>
 * Casting Objects - pages 282-283
 * <p>
 * Bad example
 */
public class E2Bird {}

class Fish {
	public static void main(String[] args) {
		Fish fish = new Fish();
//		E2Bird bird = (E2Bird) fish;  // DOES NOT COMPILE - fish does not extend E2Bird
	}
}
