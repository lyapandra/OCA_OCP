package Roman4ik2015.Ch5p202Throwble.p218PolymorphException;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

/**
 * Created by a on 09.04.2018.
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        ConcreteResource inCorrect = new ConcreteResource("info", 1);
    }
    static class Resource { // ранее созданный класс
        public Resource(String filename) throws FileNotFoundException {
// more code
        }
    }
    static class ConcreteResource extends Resource { // ранее созданный класс
        // ранее созданный конструктор
        public ConcreteResource(String name) throws FileNotFoundException {
            super(name);
// more code
        }
        // ранее созданный конструктор
        public ConcreteResource() throws IOException {
            super("file.txt");
// more code
        }
        // новый конструктор
//        public ConcreteResource(String name, int mode) { /* ошибка компиляции */
        public ConcreteResource(String name, int mode) throws FileNotFoundException { /* ошибка компиляции */
            super(name);
// more code
        }
//        public ConcreteResource(String name, int mode, String type) throws ParseException {
        public ConcreteResource(String name, int mode, String type) throws ParseException, FileNotFoundException {
/* ошибка компиляции */
            super(name);
// more code
        }
    }
}
