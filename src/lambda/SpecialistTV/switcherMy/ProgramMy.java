package lambda.SpecialistTV.switcherMy;

/**
 * Created by a on 02.04.2018.
 */
//public class Program {
class ProgramMy {
    public static void main(String[] args) {
        SwitcherMy s = new SwitcherMy();
        s.on();
        LampMy lamp01 = new LampMy();
        lamp01.printState();
        s.out();
    }
}
