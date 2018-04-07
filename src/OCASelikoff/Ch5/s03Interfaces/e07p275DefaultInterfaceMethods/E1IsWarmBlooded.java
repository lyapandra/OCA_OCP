package OCASelikoff.Ch5.s03Interfaces.e07p275DefaultInterfaceMethods;

/**
 * Chapter 5: Class Design<br>
 * Implementing Interfaces<br>
 * Default Interface Methods - pages 274-275
 * <p>
 * Example of a default interface method
 */

public interface E1IsWarmBlooded {

	boolean hasScales();
	public default double getTemperature() {
		return 10.0;
	}
}
