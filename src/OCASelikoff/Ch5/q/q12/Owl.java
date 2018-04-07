package OCASelikoff.Ch5.q.q12;

/**
 * Created by a on 07.04.2018.
 */
interface Nocturnal {
    default boolean isBlind() { return true; }
}
public class Owl implements Nocturnal {
    @Override
    public boolean isBlind() { return false; }
    public static void main(String[] args) {
        Nocturnal nocturnal = (Nocturnal)new Owl();
        System.out.println(nocturnal.isBlind());
    }
}
