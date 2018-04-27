package OCASelikoff.ch5p234ClassDesign.s02AbstractClasses.e04p263ExtendingAbstractClasses;

/**
 * Chapter 5: Class Design<br>
 * Creating Abstract Classes<br>
 * Extending an Abstract Class - pages 263-264
 */
public abstract class E1Animal {
	public abstract String getName();
}

/*
class Walrus extends E1Animal {  // DOES NOT COMPILE - 1st concrete subclass must implement all non-implemented inherited abstract classes
}
*/

// class does compile even though it does not implement getName() because it is marked as abstract
abstract class Eagle extends E1Animal {
}
