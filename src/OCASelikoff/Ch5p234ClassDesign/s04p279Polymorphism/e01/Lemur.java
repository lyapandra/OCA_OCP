package OCASelikoff.Ch5p234ClassDesign.s04p279Polymorphism.e01;
/**
 * Chapter 5: Class Design<br>
 * Understanding Polymorphism<br>
 * pages 279-281
 * <p>
 * output:<br>
 * <code>
 *     10<br>
 *     false<br>
 *     true<br>
 * </code>
 * <p>
 * The most important thing to note about this example is that only one object, Lemur, is
 * created and referenced. The ability of an instance of Lemur to be passed as an instance of an
 * interface it implements, HasTail, as well as an instance of one of its superclasses, Primate,
 * is the nature of polymorphism.
 */
public class Lemur extends Primate implements HasTail {
	@Override
	public boolean isTailStriped() {
		return false;
	}
	public int age = 10;

	public static void main(String[] args) {
		Lemur lemur = new Lemur();
		System.out.println(lemur.age);

		HasTail hasTail = lemur;
		System.out.println(hasTail.isTailStriped());
//		System.out.println(hasTail.age); // DOES NOT COMPILE

		Primate primate = lemur;
		System.out.println(primate.hasHair());
//		System.out.println(primate.isTailStriped());  // DOES NOT COMPILE
	}
}
