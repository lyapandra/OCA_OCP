package OCASelikoff.Ch5.p243;

/**
 * Created by a on 05.04.2018.
 */
class Primate {
    public Primate() {
        System.out.println("Primate");
    }
}
class Ape extends Primate {
    public Ape() {
        System.out.println("Ape");
    }
}
public class Chimpanzee extends Ape {
    public static void main(String[] args) {
        System.out.println("args = [" + args + "]");
        new Chimpanzee();
        System.out.println("Chimpanzee.main");
    }
}