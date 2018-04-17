package Roman4ik2015.p69Generics.p72GenericsMethods;

/**
 * Created by a on 15.04.2018.
 */
public class SimpleActionCourse {
    public <T1 extends Course> SimpleActionCourse(T1 course) { // конструктор
// реализация
    }
    public <T2> SimpleActionCourse() { // конструктор
// реализация
    }
    public <T3 extends Course> float calculateMark(T3 course) {
// реализация
        return 0;
    }
    public <T4> boolean printReport(T4 course) {
// реализация
        return false;
    }
    public <T5> void check() {
// реализация
    }

    public static void main(String[] args) {
        SimpleActionCourse sap = new SimpleActionCourse(new Course());
//        sap.printReport(new Course(7112));

        SimpleActionCourse sa = new <String>SimpleActionCourse();
        sa.<Integer>check();
    }
}
