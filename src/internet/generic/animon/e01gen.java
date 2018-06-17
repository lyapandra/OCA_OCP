package internet.generic.animon;

import java.util.ArrayList;
import java.util.List;

public class e01gen {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("1");
        list.add("2");
        list.add(3);

        String v1 = (String) list.get(0);
        String v2 = (String) list.get(1);
        String v3 = (String) list.get(2);

    }
}
