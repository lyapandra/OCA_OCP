package OCASelikoff.ch06p300Exceptions.s02TryStatement.e04Throwing2ndException;

/**
 * Chapter 6: Exceptions<br>
 * Using a try Statement<br>
 * Throwing a Second Exception - pages 311-313
 */
public class E2HarderExample {
	public String exceptions() {
		String result = "";
		String v = null;
		try {
			try {
				result += "before";   // 1st: result = "before"
				v.length();
				result += "after";
			} catch (NullPointerException e) {
				result += "catch";    // 2nd: result = "beforecatch"
				throw new RuntimeException();
			} finally {
				result += "finally";  // 3rd: result = "beforecatchfinally"
				throw new Exception();
			}
		} catch (Exception e) {
			result += "done";         // 4th: result = "beforecatchfinallydone"
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.println(new E2HarderExample().exceptions());  // beforecatchfinallydone
	}
}
