package OCASelikoff.Ch5.s03Interfaces.e08p277DefaultMethodsMultipleInheritance;
/**
 * Chapter 5: Class Design<br>
 * Implementing Interfaces<br>
 * Default Methods and Multiple Inheritance - pages 277-278
 */
public interface WalkDiffM {
	public default int getWalkSpeed() {
		return 5;
	}
}
