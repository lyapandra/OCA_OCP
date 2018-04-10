package OCASelikoff.Ch5p234ClassDesign.s04p279Polymorphism.e02p280ObjectVsReference;

/**
 * Chapter 5: Class Design<br>
 * Understanding Polymorphism<br>
 * Object vs. Reference - pages 281-282
 * <p>
 * In Java, all objects are accessed by reference, so as a developer you never have direct access
 * to the object itself. Conceptually, though, you should consider the object as the entity that
 * exists in memory, allocated by the Java runtime environment. Regardless of the type of the
 * reference you have for the object in memory, the object itself doesn’t change.
 * <ol>
 *     <li>The type of the object determines which properties exist within the object in memory.</li>
 *     <li>The type of the reference to the object determines which methods and variables are
 *         accessible to the Java program.</li>
 * </ol>
 */
public class Lemur {
	public void getName(){
        System.out.println("Lemur");
	}
	static public void main(String... args) {
		Lemur lemur = new Lemur();     // lemur has access to Lemur and Object members
		lemur.getName();
		Object lemurAsObject = lemur;  // lemurAsObject only has access to Object members
//		lemurAsObject.getName();
	}
}
