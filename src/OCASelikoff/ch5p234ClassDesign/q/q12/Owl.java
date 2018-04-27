package OCASelikoff.ch5p234ClassDesign.q.q12;

/**
 * Created by a on 07.04.2018.
 */
interface Nocturnal {
    default boolean isBlind() { return true; }
}
class Sup {
    boolean isSup() { return true; }
}

public class Owl extends Sup implements Nocturnal {
    @Override
    public boolean isBlind() { return false; }
    @Override
    public boolean isSup() { return false; }

    public static void main(String[] args) {
        Nocturnal nocturnal = (Nocturnal)new Owl();
        System.out.println(nocturnal.isBlind());
        Sup sup = (Sup) new Owl();
        System.out.println(sup.isSup());
    }
}
