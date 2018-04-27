package OCASelikoffGit.ch04_methods_encapsulation.e11_static_imports;

//import static java.util.Arrays;  // DOES NOT COMPILE - cannot static import a class
import static java.util.Arrays.asList;
//static import java.util.Arrays.*;  // DOES NOT COMPILE - bad order of keywords static import - must be import static

/**
 * Chapter 4: Methods and Encapsulation<br>
 * Static Imports<br>
 * pages 187-188
 */
public class E3BadStaticImports {
	public static void main(String[] args) {
//		Arrays.asList("one");  // DOES NOT COMPILE - failed to import the Arrays class
		asList("one");  // but we can do this without the Arrays class
	}
}
