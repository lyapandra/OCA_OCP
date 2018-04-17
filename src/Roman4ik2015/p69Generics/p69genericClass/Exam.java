package Roman4ik2015.p69Generics.p69genericClass;

/**
 * Created by a on 13.04.2018.
 */
public class Exam<T extends Number> {
    private String name;
    private T mark; // параметр поля
    public Exam(T mark, String name) { // параметр конструктора
        this.name = name;
        this.mark = mark;
    }
    public T getMark() { // параметр метода
        return mark;
    }
    private int roundMark() {
        return Math.round(mark.floatValue()); // метод класса Number
    }
    public boolean equalsToMark(Exam<T> ob) { // параметр метода
        return roundMark() == ob.roundMark();
    }
   public boolean equalsToMarkAnyType(Exam<?> ob) { // параметр метода
        return roundMark() == ob.roundMark();
    }
}