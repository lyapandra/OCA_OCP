package OCASelikoffGit.ch02_operators_statements.e05_relational_operators;

/**
 * Chapter 2: Operators and Statements<br/>
 * Using Additional Binary Operators<br/>
 * Relational Operators - page 63
 * <p>
 * Relational operators compare two expressions and return a boolean value. The first
 * four relational operators are applied to numeric primitive data types only. If the
 * two numeric operands are not of the same data type, the smaller one is promoted.
 */
public class RelationalOperators extends SuperRelationalOperators  {
	public void thisM() {
		System.out.println("RelationalOperators.thisM");
	}

	public static void main(String[] args) {
		int x = 10, y = 20, z = 10;
		System.out.println(x < y);  // outputs true
		System.out.println(x <= y);  // outputs true
		System.out.println(x >= z);  // outputs true
		System.out.println(x > z);  // outputs false

		RelationalOperators a = new RelationalOperators();
		System.out.println(a instanceof Object);  // outputs true
		System.out.println(a.getClass().getSimpleName());  // outputs true
//		System.out.println(a.getClass().getName());  // outputs true
		System.out.println("=======================");

		SuperRelationalOperators superA = /*(RelationalOperators)*/ new RelationalOperators();
//		RelationalOperators superA = (RelationalOperators) new SuperRelationalOperators();
		System.out.println(superA instanceof SuperRelationalOperators);  // outputs true
		System.out.println(superA instanceof RelationalOperators);  // outputs true
		System.out.println(superA instanceof SubRelationalOperators);  // outputs true
		System.out.println(superA.getClass().getSimpleName());  // outputs true
		superA.superM();

		System.out.println("=======================");
		RelationalOperators subA = new SubRelationalOperators();
		System.out.println(subA instanceof Object);  // outputs true
		System.out.println(subA.getClass().getSimpleName());  // outputs true
	}
}

 class SuperRelationalOperators {
	public void superM(){
		System.out.println("SuperRelationalOperators.superM");
	}
 }
 class SubRelationalOperators extends RelationalOperators {
	 public void subM() {
		 System.out.println("SubRelationalOperators.subM");
	 }
 }
