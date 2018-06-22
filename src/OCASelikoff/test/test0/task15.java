package OCASelikoff.test.test0;

import java.util.ArrayList;
import java.util.List;

public class task15 {
        public static void main(String[] args) {
            List<Tadpole> tadpoles = new ArrayList<Tadpole>();
            for(Amphibian amphibian : tadpoles) {
                Object tadpole = amphibian;
//                CanSwim tadpole = amphibian;
//                Amphibian tadpole = amphibian;
                amphibian.methodAmphibian();
                };
            } }

interface CanSwim {void methodCanSwim();}
class Amphibian implements CanSwim {
    @Override
    public void methodCanSwim() {}
    public void methodAmphibian() {}
}
class Tadpole extends Amphibian {
    public void methodTadPole() {}
}