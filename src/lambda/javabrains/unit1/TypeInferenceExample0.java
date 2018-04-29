package lambda.javabrains.unit1;

public class TypeInferenceExample0 {

	public static void main(String[] args) {
		StringLengthLambda myLabda = (String s) -> s.length();
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
