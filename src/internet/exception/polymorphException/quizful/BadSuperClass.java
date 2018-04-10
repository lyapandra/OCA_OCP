package internet.exception.polymorphException.quizful;

import java.io.IOException;

/**
 * @author http://www.quizful.net/post/java-exceptions
 * @date: 10.04.2018.
 */
public class BadSuperClass {
        public void start() throws IOException/*, Exception */{
            throw new IOException("Not able to open file");
        }
    }
    class BadSubClass extends BadSuperClass{
        /*@Override
        public void start() throws Exception{
            throw new Exception("Not able to start");
        }*/
    }