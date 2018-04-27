package OCASelikoffGit.ch05_class_design.s04_polymorphism.e03_casting_objects;

/**
 * Chapter 5: Class Design<br>
 * Understanding Polymorphism<br>
 * Casting Objects - pages 282-283
 * <p>
 * Bad example
 * <p>
 * The object is an E3Rodent instance, not a Capybara instance.  Even though Capybara extends E3Rodent, an instance that is
 * an E3Rodent cannot be cast to its child class.  This does actually compile though.
 */
public class E3Rodent {
}

class Capybara extends com.jashepherd.studies.java.ocajavase8.ch05_class_design.s04_polymorphism.e03_casting_objects.E3Rodent {
	public static void main(String[] args) {
		com.jashepherd.studies.java.ocajavase8.ch05_class_design.s04_polymorphism.e03_casting_objects.E3Rodent rodent = new com.jashepherd.studies.java.ocajavase8.ch05_class_design.s04_polymorphism.e03_casting_objects.E3Rodent();
		com.jashepherd.studies.java.ocajavase8.ch05_class_design.s04_polymorphism.e03_casting_objects.Capybara capybara = (com.jashepherd.studies.java.ocajavase8.ch05_class_design.s04_polymorphism.e03_casting_objects.Capybara) rodent;  // Throws ClassCastException at runtime
	}
}
