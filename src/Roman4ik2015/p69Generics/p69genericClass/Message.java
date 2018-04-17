package Roman4ik2015.p69Generics.p69genericClass;

/**
 * Created by a on 13.04.2018.
 * * @author Roman4ik
 */
public class Message <T> {
    private T value;
    public Message() {
    }
    public Message (T value) {
        this.value = value;
    }
    public T getValue() {
        return value;
    }
    public void setValue(T value) {
        this.value = value;
    }
    public String toString() {
        if (value == null) {
            return null;
        }
        return value.getClass().getName() + " :" + value;
    }
}