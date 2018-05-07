package OCASelikoffGit.ch02_operators_statements.e08_if_statements;

/**
 * Chapter 2: Operators and Statements<br/>
 * Understanding Java Statements<br/>
 * The if-then Statement - pages 67-68
 */
public class IfStatements {
	public static void main(String[] args) {

		int hourOfDay = 3;
		int morningGreetingCount = 0;

		if (hourOfDay < 11) {
			System.out.println("Good Morning");
		}

		if (hourOfDay > 11) {
			System.out.println("Good Morning");
			morningGreetingCount++;
		}

		if (hourOfDay < 11)
			System.out.println("Good Morning");
			morningGreetingCount++;  // not part of if statement
		System.out.println("morningGreetingCount = " + morningGreetingCount);
	}

}
