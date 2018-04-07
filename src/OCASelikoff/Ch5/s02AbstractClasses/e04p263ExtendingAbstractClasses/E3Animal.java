package OCASelikoff.Ch5.s02AbstractClasses.e04p263ExtendingAbstractClasses;

/**
 * Chapter 5: Class Design<br>
 * Creating Abstract Classes<br>
 * Extending an Abstract Class - pages 264-265
 */
public abstract class E3Animal {
	public abstract String getName();
}

abstract class E3BigCat extends E3Animal {
	public String getName() {  // abstract classes may also include implementation methods
		return "BigCat";
	}
	public abstract void roar();
}

// E3Lion only has to implement roar() since the abstract class E3BigCat took care of the implementation of getName()
class E3Lion extends E3BigCat {
	public void roar() {
		System.out.println("The Lion lets out a load ROAR!");
	}

	public static void main(String[] args) {
		E3Lion l = new E3Lion();
		System.out.println("l.getName() = " + l.getName());;
		l.roar();

	}
}