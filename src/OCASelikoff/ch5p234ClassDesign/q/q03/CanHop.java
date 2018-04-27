package OCASelikoff.ch5p234ClassDesign.q.q03;

/**
 * Created by a on 07.04.2018.
 */
public interface CanHop {
    default void getName() {
        System.out.println("CanHop.instance initializer");
    }
}
