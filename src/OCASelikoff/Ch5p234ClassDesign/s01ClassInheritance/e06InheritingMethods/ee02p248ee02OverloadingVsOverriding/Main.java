package OCASelikoff.Ch5p234ClassDesign.s01ClassInheritance.e06InheritingMethods.ee02p248ee02OverloadingVsOverriding;

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
