package OCASelikoff.Ch5.s04p279Polymorphism.e03CastingObjects;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by a on 07.04.2018.
 */
public class M01 {
    public static void main(String[] args) {
        List list = new ArrayList();
        ArrayList arrayList = new ArrayList();
        arrayList = (ArrayList) list;
    }
}
