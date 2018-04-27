package OCASelikoffGit.ch02_operators_statements.e10_switch_statements;

/**
 * Chapter 2: Operators and Statements<br/>
 * Understanding Java Statements<br/>
 * The switch Statement - pages 72-76
 * <p>
 * Data types supported by switch statements:
 * <ul>
 *   <li>int and Integer</li>
 *   <li>byte and Byte</li>
 *   <li>short and Short</li>
 *   <li>char and Char</li>
 *   <li>String</li>
 *   <li>enum values</li>
 * </ul>
 */
public class SwitchStatements {
	public static void main(String... args) {
		int dayOfWeek = 5;
		switch (dayOfWeek) {
			default:
				System.out.println("Weekday");
				break;
			case 0:
				System.out.println("Sunday");
				break;
			case 6:
				System.out.println("Saturday");
				break;
		}

		System.out.println("");

		switch (dayOfWeek) {
			case 0:
				System.out.println("Sunday");
			default:
				System.out.println("Weekday");
			case 6:
				System.out.println("Saturday");
				break;
		}
	}

	private int getSortOrder(String firstName, final String lastName) {
		String middleName = "Patricia";
		final String suffix = "JR";
		int id = 0;
		switch (firstName) {
			case "Test":
				return 52;
			/*case middleName:  // DOES NOT COMPILE - middleName not final
				id = 5;
				break;*/
			case suffix:
				id = 0;
				break;
			/*
			case lastName:  // DOES NOT COMPILE - not constant even though parameter is final
				id = 8;
				break;
			case 5:  // DOES NOT COMPILE - does not match data type
				id = 7;
				break;
			case 'J':  // DOES NOT COMPILE - does not match data type, this is a char not a String
				id = 10;
				break;
			case java.time.DayOfWeek.SUNDAY:  // DOES NOT COMPILE - does not match data type, this is an enum not a String
				id = 15;
				break;
			*/
		}
		return id;
	}
}
