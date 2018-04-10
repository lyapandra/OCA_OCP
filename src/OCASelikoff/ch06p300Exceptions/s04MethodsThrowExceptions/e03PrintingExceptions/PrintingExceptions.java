package OCASelikoff.ch06p300Exceptions.s04MethodsThrowExceptions.e03PrintingExceptions;

/**
 * Chapter 6: Exceptions<br>
 * Calling Methods That Throw Exceptions<br>
 * Printing an Exception - pages 321-322
 */
public class PrintingExceptions {
	public static void main(String[] args) {
		try {
			hop();
		} catch (Exception e) {
			System.out.println(e);
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
	private static void hop() {
		throw new RuntimeException("cannot hop");
	}
}
