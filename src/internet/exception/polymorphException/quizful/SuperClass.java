package internet.exception.polymorphException.quizful;

import java.io.FileNotFoundException;
import java.io.IOException;
/**
 * @author http://www.quizful.net/post/java-exceptions
 * @date: 10.04.2018.
 */
public class SuperClass {
    public void start() throws IOException, Exception {
        throw new IOException("Not able to open file");
    }

    public static void main(String[] args) {

    }
}
class SubClass extends SuperClass{
    @Override
    public void start() throws FileNotFoundException{
// FileNotFoundException - наследник IOException
        throw new FileNotFoundException("Not able to start");
    }
}