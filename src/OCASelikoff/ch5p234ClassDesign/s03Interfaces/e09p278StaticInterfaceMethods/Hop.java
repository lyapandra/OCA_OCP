package OCASelikoff.ch5p234ClassDesign.s03Interfaces.e09p278StaticInterfaceMethods;

/**
 * Chapter 5: Class Design<br>
 * Implementing Interfaces<br>
 * Static Interface Methods - pages 278-279
 * <p>
 * New to Java 8 are static interface methods.  They behave almost exactly like static methods defined in classes except that
 * they are not inherited.  The interface name must be used to reference the interface static method.
 */
public interface Hop {
	static int getJumpHeight() {
		return 8;
	}
}
