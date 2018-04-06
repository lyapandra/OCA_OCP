package OCASelikoff.Ch5.p248;

/**
 * Created by a on 05.04.2018.
 */
public class Eagle extends Bird {
    public int fly(int height) {
        System.out.println("Bird is flying at " + height + " meters");
        return height;
    }

    public void eat(int food) { // DOES NOT COMPILE
        System.out.println("Bird is eating " + food + " units of food");
//        return food;
    }
}
