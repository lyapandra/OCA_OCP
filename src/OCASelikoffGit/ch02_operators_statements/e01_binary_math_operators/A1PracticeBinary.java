package OCASelikoffGit.ch02_operators_statements.e01_binary_math_operators;

/**
 * Chapter 2: Operators and Statements<br/>
 * Working with Binary Arithmetic Operators<br/>
 * Arithmetic Operators - pages 54-55
 * <p>
 * Pretty basic operator precedence stuff.  % is modulus, also pretty basic.
 */
public class A1PracticeBinary {
	private static int z0;
	int z01;
	int x1 = 2 * 5 + 3 * 4 - 8;  // x1 = 14
	int x2 = 2 * ((5 + 3) * 4 - 8);  // x2 = 48

	public static void main(String... args) {
		z0 = 5;
		A1PracticeBinary a = new A1PracticeBinary();
		System.out.println("a.z01 = " + a.z01);

		System.out.println(9 / 3);  // Outputs 3
		System.out.println(9 % 3);  // Outputs 0
		System.out.println(10 / 3);  // Outputs 3
		System.out.println(10 % 3);  // Outputs 1
		System.out.println(11 / 3);  // Outputs 3
		System.out.println(11 % 3);  // Outputs 2
		System.out.println(12 / 3);  // Outputs 4
		System.out.println(12 % 3);  // Outputs 0
	}
}
