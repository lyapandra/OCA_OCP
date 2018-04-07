package OCASelikoff.Ch5.s03Interfaces.e08p277DefaultMethodsMultipleInheritance;

/**
 * Chapter 5: Class Design<br>
 * Implementing Interfaces<br>
 * Default Methods and Multiple Inheritance - pages 277-278
 */
//public class Cat {}
//public class Cat implements WalkDiffM, Run {  // DOES NOT COMPILE - ambiguous, Walk and Run both have default method getSpeed()
public class Cat implements Walk, Run {  // DOES NOT COMPILE - ambiguous, Walk and Run both have default method getSpeed()
	public static void main(String[] args) {
		System.out.println(new Cat().getSpeed());
		System.out.println(new Cat().getWalkSpeed());
	}

	@Override
    public int getSpeed (){
	    return 1;
    }
}
