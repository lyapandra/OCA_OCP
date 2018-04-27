package OCASelikoff.ch5p234ClassDesign.s03Interfaces.e06p273InterfaceVariables;

/**
 * Chapter 5: Class Design<br>
 * Implementing Interfaces<br>
 * Interface Variables - pages 273-274
 * <p>
 * Interface variables are assumed to be public, static, and final.  Values of interface variables must be set when declared.
 */
public interface E1CanSwim {
	int MAXIMUM_DEPTH = 100;
	final static boolean UNDERWATER = true;
	public static final String TYPE = "Submersible";

}

/*
// the above will be automatically converted by the compiler to the following
public abstract interface CanSwim {
	public static final int MAXIMUM_DEPTH = 100;
	public static final boolean UNDERWATER = true;
	public static final String TYPE = "Submersible";
}
 */
