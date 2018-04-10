package OCASelikoff.Ch5p234ClassDesign.q.q17;

/**
 * Created by a on 08.04.2018.
 */
public abstract class Whale {
    public abstract void dive() /*{}*/;
    public static void main(String[] args) {
        Whale whale = new Orca();
        whale.dive();
    }
}
class Orca extends Whale {
    public void dive(int depth) { System.out.println("Orca diving"); }

    @Override
    public void dive() {

    }
}
