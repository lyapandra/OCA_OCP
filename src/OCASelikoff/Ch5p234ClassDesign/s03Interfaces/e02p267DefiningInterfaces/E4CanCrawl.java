package OCASelikoff.Ch5p234ClassDesign.s03Interfaces.e02p267DefiningInterfaces;
/**
 * Chapter 5: Class Design<br>
 * Implementing Interfaces<br>
 * Defining an Interface - pages 267-268
 * <p>
 * Examples of invalid interfaces and interface methods
 */
public interface E4CanCrawl {}

/*
private final interface E4CanCrawl {    // DOES NOT COMPILE - interfaces cannot be marked final and must be public or default
	private void dig(int depth);        // DOES NOT COMPILE - interface methods cannot be marked private
	protected abstract double depth();  // DOES NOT COMPILE - interface methods must be public and abstract
	public final void surface();        // DOES NOT COMPILE - interface methods cannot be marked final
}
*/