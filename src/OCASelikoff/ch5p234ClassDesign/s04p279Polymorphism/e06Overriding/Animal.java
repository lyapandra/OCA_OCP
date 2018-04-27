package OCASelikoff.ch5p234ClassDesign.s04p279Polymorphism.e06Overriding;

/**
 * Chapter 5: Class Design<br>
 * Understanding Polymorphism<br>
 * Polymorphism and Method Overriding - pages 287-288
 */
public class Animal {
	public String getName() {
		return "Animal";
	}
}

class Gorilla extends Animal {
//	protected String getName() {  // DOES NOT COMPILE - overridden method cannot be less accessible than parent method
	@Override
	public String getName() {
		return "Gorilla";
	}
}

class ZooKeeper {
	public static void main(String[] args) {
//		Animal animal = new Animal();
		Animal animal = new Gorilla();
		System.out.println(animal.getName());
	}
}