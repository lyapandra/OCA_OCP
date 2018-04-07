package OCASelikoff.Ch5.s02AbstractClasses.e03p262СoncreteСlass;

import OCASelikoff.Ch5.s02AbstractClasses.e01.Animal;

/**
 * Chapter 5: Class Design<br>
 * Creating Abstract Classes<br>
 * Creating a Concrete Class - pages 262-263
 */
public abstract class E2Animal {
	public abstract String getName();
}

/*
class Walrus extends E2Animal {  // DOES NOT COMPILE - concrete class must implement all non-implemented abstract classes
}
*/

/*
class Bird extends Animal {  // DOES NOT COMPILE - 1st concrete subclass must implement all inherited abstract methods
}


*/
//Even though a subclass of Bird does implement getName(), it is not good enough since Flamingo is not the 1st concrete subclass
class Flamingo extends Animal {
	public String getName() {
		return "Flamingo";
	}
}