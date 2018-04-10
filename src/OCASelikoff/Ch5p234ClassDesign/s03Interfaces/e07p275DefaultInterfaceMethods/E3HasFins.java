package OCASelikoff.Ch5p234ClassDesign.s03Interfaces.e07p275DefaultInterfaceMethods;

/**
 * Chapter 5: Class Design<br>
 * Implementing Interfaces<br>
 * Default Interface Methods - pages 276-277
 */
public interface E3HasFins {
	public default int getNumberOfFins() {
		return 4;
	}
	public default double getLongestFinLength() {
		return 20.0;
	}
	public default boolean doFinsHaveScales() {
		return true;
	}
}
