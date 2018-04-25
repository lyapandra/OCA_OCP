package OCPSelikoff.chapter3.generics.LegacyCode115;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by a on 22.04.2018.
 */
public class LegacyDragons {
    public static void main(String[] args) {
        List unicorns = new ArrayList();
        unicorns.add(new Unicorn());
        unicorns.add(new Dragon());

        printDragons(unicorns);
    }
    private static void printDragons(List<Dragon> dragons) {
        for (Dragon dragon: dragons) { // ClassCastException
            System.out.println(dragon);
        } } }