package internet.reflection.stackoverflow;
import internet.exception.polymorphException.quizful.SuperClass;
//https://github.com/ronmamo/reflections
import org.reflections.Reflections;
import org.reflections.scanners.SubTypesScanner;
import org.reflections.util.ClasspathHelper;

import java.util.HashSet;
import java.util.Set;

public class FindSubclasses {
    public static void main(String[] args) {
        SubType subType = new SubType();
        subType.whatIsIt();
//        Set<Class<?>> s = subType.findSubType();
//        System.out.println("s = " + s);
//        [class internet.exception.polymorphException.quizful.SubClass]
    }

    public static class SubType {
        Set<Class<?>> findSubType(){
            Reflections reflections = new Reflections(ClasspathHelper.forJavaClassPath(), new SubTypesScanner());
            Set<Class<?>> subTypes = new HashSet<>();
            for (String className : reflections.getStore().get(SubTypesScanner.class.getSimpleName()).values()) {
                try {
                    Class subType = Class.forName(className);
                    if (SuperClass.class.isAssignableFrom(subType)) {
                        subTypes.add(subType);
                    }
                } catch (ClassNotFoundException e) {
                    throw new RuntimeException("Этого не может быть:)", e);
                }
            }
            return subTypes;
        }

        void whatIsIt(){
            System.out.println("ClasspathHelper.forJavaClassPath() = " + ClasspathHelper.forJavaClassPath());
        }
    }
}
