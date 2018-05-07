package OCASelikoffGit.ch02_operators_statements.e03_assignment_operators;

/**
 * Chapter 2: Operators and Statements<br/>
 * Using Additional Binary Operators<br/>
 * Assignment Operators and Casting Primitive Values - pages 60-61
 * <p>
 * Java will automatically promote from smaller to larger data types, as we saw in the previous
 * section on arithmetic operators, but it will throw a compiler exception if it detects you are
 * trying to convert from larger to smaller data types.
 */
public class AssignmentOperators {
    int x1 = 1;

	/* bad examples
	int x = 1.0;  // DOES NOT COMPILE
	short y = 1921222;  // DOES NOT COMPILE
	int z = 9f;  // DOES NOT COMPILE
	long t = 192301398193810323;  // DOES NOT COMPILE
	 */

    // Casting Primitive Values
    int x = (int) 1.0;
    static  short y = (short) 26812;  // stored as 20678
//    static  short y = /*(short) */1921222;  // stored as 20678
    static  short y1 = (short) 1921;  // stored as 20678
    static float aFloat = 1f;

    public static void main(String[] args) {
        System.out.println("new AssignmentOperators().aFloat = " + new AssignmentOperators().aFloat);
        System.out.println("y = " + y);
        System.out.println("y1 = " + y1);
    }

    int z = (int) 9f;
    long t = 192301398193810323L;

    short x2 = 10;
    short y2 = 3;
//    short z2sh = /*(short)*/ (x2 * y2);  // DOES NOT COMPILE
    short z2 = (short) (x2 * y2);  // but this does work
    int z3 = x2 * y2;  // this works too
}
