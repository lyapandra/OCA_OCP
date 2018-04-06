package OCASelikoff.Ch5.p248;

/**
 * Created by a on 05.04.2018.
 */
public class Main {
    public static void main(String[] args) {
        Eagle e = new Eagle();
        Bird b = new Bird();
        b.fly();
        b.eat(2);
        e.eat(3);
        e.fly(4);

    }
}
