package OCASelikoff.Ch5.q.q02;

/**
 * Created by a on 07.04.2018.
 */
public class Mammal {
    public Mammal(int age) {
        System.out.print("Mammal");
    }

    /*Mammal() {
    }*/
}
/*public */class Platypus extends Mammal {
    public Platypus() {
        super(10);
        System.out.print("Platypus");
    }
    public static void main(String[] args) {
        new Mammal(5);
    }
}
