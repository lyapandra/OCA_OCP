package Roman4ik2015.p69Generics.p69genericClass;

/**
 * Created by a on 13.04.2018.
 */
public class ExamRunner {
    public static void main(String[ ] args) {
        Exam<Double> md1 = new Exam<Double>(71.1D,"Progr");// 71.5d
        Exam<Double> md2 = new Exam<Double>(71.4D, "Progr");// 71.5d
        Exam<Double> md3 = new Exam<Double>(71.5D, "Progr");// 71.5d
        System.out.println("md1.getMark() = " + md1.getMark());
        System.out.println("md2.getMark() = " + md2.getMark());
        System.out.println("md3.getMark() = " + md3.getMark());
        System.out.println(md1.equalsToMark(md2));
        System.out.println(md1.equalsToMark(md3));
        Exam<Integer> mi = new Exam<Integer>(71,"Progr");
// md1.equalsToMark(mi); // ошибка компиляции: несовместимые типы
        System.out.println("md1.equalsToMarkAnyType(mi) = " + md1.equalsToMarkAnyType(mi));;
//        Exam<Integer> mii = new Exam<String>("string","Progr"); // ERROR
    }
}
