package internet.lambda.javabrains.unit1;

public class TypeInferenceExample01 {

	public static void main(String[] args) {
		StringLengthLambda myLabda = s -> s.length();
		System.out.println(myLabda.getLength("What is my length"));
		/*printLambda(s -> s.length());*/
	}

	/*public static void printLambda(StringLengthLambda l) {
		System.out.print(l.getLength("Hello Lambda"));
	}*/

	interface StringLengthLambda {
		int getLength(String s);
	}
}
