package OCASelikoff.Ch5.s02AbstractClasses.e04p263ExtendingAbstractClasses;

/**
 * Chapter 5: Class Design<br>
 * Creating Abstract Classes<br>
 * Extending an Abstract Class - page 264
 */
public abstract class E2Animal {
	public abstract String getName();
}

abstract class BigCat extends E2Animal {
	public abstract void roar();
}

class Lion extends BigCat {  // this class must implement all non-implemented inherited abstract methods - getName() and roar()
	public String getName() {
		return "Lion";
	}
	public void roar() {
		System.out.println("The Lion lets out a load ROAR!");
	}
}
