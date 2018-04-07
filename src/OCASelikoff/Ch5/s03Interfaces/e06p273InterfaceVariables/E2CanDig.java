package OCASelikoff.Ch5.s03Interfaces.e06p273InterfaceVariables;
/**
 * Chapter 5: Class Design<br>
 * Implementing Interfaces<br>
 * Interface Variables - pages 273-274
 * <p>
 * Bad examples
 */
public interface E2CanDig {
    int MAXIMUM_DEPTH = 100;
	/*
	private int MAXIMUM_DEPTH = 100;  // DOES NOT COMPILE - must be public, cannot be marked private
	protected abstract boolean UNDERWATER = false;  // DOES NOT COMPILE - must be public and cannot be marked abstract
	public static String TYPE;  // DOES NOT COMPILE - not set when declared
	*/
}
