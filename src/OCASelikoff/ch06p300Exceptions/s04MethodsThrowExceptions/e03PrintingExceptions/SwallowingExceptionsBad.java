package OCASelikoff.ch06p300Exceptions.s04MethodsThrowExceptions.e03PrintingExceptions;

import java.io.IOException;

/**
 * Chapter 6: Exceptions<br>
 * Calling Methods That Throw Exceptions<br>
 * Swallowing Exception Is Bad - page 322
 */
public class SwallowingExceptionsBad {
	public static void main(String[] args) {
		String textInFile = null;
		try {
			readInFile();
		} catch (IOException e) {  // poorly handled exception
			// ignore exception
		}
		// imagine many lines of code here
		System.out.println(textInFile.replace(" ", ""));  // NullPointerException
	}
	private static void readInFile() throws IOException {
		throw new IOException();
	}
}
