package OCASelikoff.test.test0.task08;
public class Deer {
    public Deer() {
        System.out.println("Deer()");
    }

    public Deer(int age) {
        System.out.println("Deer(age)");
    }

    public boolean hasHorns() {
//    private boolean hasHorns() {
        return false;
    }

    public static void main(String[] args) {
        Deer deer = new Reindeer(5);
        System.out.println("," + deer.hasHorns());
    }
}

class Reindeer extends Deer {
    public Reindeer(int age) {
        System.out.println("Reindeer(age)");
    }

    public boolean hasHorns() {
        return true;
    }

}
