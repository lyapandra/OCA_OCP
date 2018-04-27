package OCASelikoff.ch5p234ClassDesign.q.q03;

/**
 * Created by a on 07.04.2018.
 */
public class Frog implements CanHop {
    public void getNameFrog(){
        System.out.println("Frog.getName");
    }

    public static void main(String[] args) {
        Frog frogFrog = new TurtleFrog();
        frogFrog.getName();
        frogFrog.getNameFrog();
        System.out.println("=== 15 ====");

        TurtleFrog turtleFrog = new TurtleFrog();
        turtleFrog.getName();
        turtleFrog.getNameFrog();
        turtleFrog.getNameTurtleFrog();
        System.out.println("=== 21 ====");

        CanHop canHopFrog= new TurtleFrog();
        canHopFrog.getName();
        System.out.println("=== 25 ====");

        Object objectFrog= new TurtleFrog();
        System.out.println(objectFrog.toString());;
//        BrazilianHornedFrog brazilianHornedFrog = new TurtleFrog();
    }
}