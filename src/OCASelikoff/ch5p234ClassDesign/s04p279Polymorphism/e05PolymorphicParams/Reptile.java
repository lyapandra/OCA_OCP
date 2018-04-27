package OCASelikoff.ch5p234ClassDesign.s04p279Polymorphism.e05PolymorphicParams;
/**
 * Chapter 5: Class Design<br>
 * Understanding Polymorphism<br>
 * Polymorphic Parameters - pages 285-286
 */
public class Reptile {
	public String getName() {
		return "Reptile";
	}
}

class Alligator extends Reptile {
	@Override
	public String getName() {
		return "Alligator";
	}
}

class Crocodile extends Reptile {
	@Override
	public String getName() {
		return "Crocodile";
	}
}

class ZooWorker {
	public static void feed(Reptile reptile) {
		System.out.println("Feeding reptile " + reptile.getName());
	}

	/* outputs:
	 * Feeding: Alligator
	 * Feeding: Crocodile
	 * Feeding: Reptile
	 */
	public static void main(String[] args) {
		feed(new Alligator());
		feed(new Crocodile());
		feed(new Reptile());
	}
}
