package OCASelikoffGit.ch02_operators_statements.e04_compound_assignment_operators;

/**
 * Chapter 2: Operators and Statements<br/>
 * Using Additional Binary Operators<br/>
 * Compound Assignment Operators - page 62
 */
public class CompoundAssignmentOperators {
	public static void main(String[] args) {
		int x = 2, x1 = 2,x2 = 2, z = 3;
		x1 = x1 + z;  // simple assignment operator
		x2 += z;  // compound assignment operator
//		System.out.println(x);  // outputs 8
		System.out.println("x1 = " + x1);
		System.out.println("x2 = " + x2);

		x = 2; z = 3;
		x = x - z;  // simple assignment operator
		x -= z;  // compound assignment operator
		System.out.println(x);  // outputs -4

		x = 2; z = 3;
		x = x * z;  // simple assignment operator
		x *= z;  // compound assignment operator
		System.out.println(x);  // outputs 18

		x = 18; z = 3;
		x = x / z;  // simple assignment operator
		x /= z;  // compound assignment operator
		System.out.println(x);  // outputs 2

		long x1L = 10;
		int y1L = 5;
		// y1 = y1 * x1;  // DOES NOT COMPILE - long won't implicitly fit into an int var
		y1L = (int)(y1L * x1L);  // works but there's another way
		y1L *= x1L;  // compound operators automatically downcast

		long x2L = 5;
		long y2L = (x2=3);
		System.out.println(x2L);  // outputs 3
		System.out.println(y2L);  // also outputs 3
	}
}
