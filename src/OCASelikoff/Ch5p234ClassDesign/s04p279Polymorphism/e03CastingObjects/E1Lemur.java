package OCASelikoff.Ch5p234ClassDesign.s04p279Polymorphism.e03CastingObjects;

import OCASelikoff.Ch5p234ClassDesign.s04p279Polymorphism.e01.HasTail;
import OCASelikoff.Ch5p234ClassDesign.s04p279Polymorphism.e01.Primate;

/**
 * Chapter 5: Class Design<br>
 * Understanding Polymorphism<br>
 * Casting Objects - pages 282-283
 * <p>
 * In this example, we first try to convert the primate reference back to a lemur reference,
 * lemur2, without an explicit cast. The result is that the code will not compile. In the second
 * example, though, we explicitly cast the object to a subclass of the object Primate and we
 * gain access to all the methods available to the Lemur class.
 * <ol>
 *     <li>Casting an object from a subclass to a superclass doesn’t require an explicit cast.</li>
 *     <li>Casting an object from a superclass to a subclass requires an explicit cast.</li>
 *     <li>The compiler will not allow casts to unrelated types.</li>
 *     <li>Even when the code compiles without issue, an exception may be thrown at runtime if
 *         the object being cast is not actually an instance of that class.</li>
 * </ol>
 */
public class E1Lemur extends Primate implements HasTail{
	public int age = 10;

	@Override
	public boolean isTailStriped() {
		return false;
	}

	public static void main(String[] args) {
		E1Lemur lemur = new E1Lemur();
		System.out.println("33 lemur.age = " + lemur.age);
		System.out.println("34 lemur.isTailStriped() = " + lemur.isTailStriped());
		System.out.println("35 lemur.hasHair() = " + lemur.hasHair());

		Primate primate = lemur;
		System.out.println("38 primate.hasHair() = " + primate.hasHair());

//		Object o = lemur;
/*
		Object o1 = new Object();
		Primate p1 = (Primate) o1;
		System.out.println("44 p1.hasHair() = " + p1.hasHair());


		E1Lemur lemur1 = (E1Lemur) o1;
		System.out.println("47 lemur1.age = " + lemur1.age);
		System.out.println("48 lemur1.isTailStriped() = " + lemur1.isTailStriped());
		System.out.println("49 lemur1.hasHair() = " + lemur1.hasHair());
*/

//		E1Lemur lemur2 = primate;  // DOES NOT COMPILE - cannot cast to child without explicit cast

		E1Lemur lemur3 = (E1Lemur) primate;
		System.out.println("54 lemur3.age = " + lemur3.age);
		System.out.println("55 lemur3.isTailStriped() = " + lemur3.isTailStriped());
		System.out.println("56 lemur3.hasHair() = " + lemur3.hasHair());

	}
}
