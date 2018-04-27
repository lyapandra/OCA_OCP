package OCASelikoff.ch5p234ClassDesign.s01ClassInheritance.e06InheritingMethods.ee02p248ee02OverloadingVsOverriding;

/**
 * Created by a on 05.04.2018.
 */
public class Bird {
    public void fly() {
        System.out.println("Bird is flying");
    }
    public void eat(int food) {
        System.out.println("Bird is eating "+food+" units of food");
    }
}