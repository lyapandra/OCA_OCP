package OCPSelikoff.chapter2.functional_interface.nonfunctional;

import OCPSelikoff.chapter2.functional_interface.Animal;
import OCPSelikoff.chapter2.functional_interface.Sprint;

/**
 * Created by Serhii K. on 2/4/2016.
 */
// NON FUNCTIONAL INTERFACE!
public interface Dance extends Sprint {
    void dance(Animal animal);
}