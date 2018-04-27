package OCASelikoff.ch5p234ClassDesign.q.q04;

import org.jetbrains.annotations.NotNull;

/**
 * Created by a on 07.04.2018.
 */
public class Rodent {
    @NotNull
//    protected static Integer chew() throws Exception {
    protected static Number chew() throws Exception {
        System.out.println("Rodent is chewing");
        return 1.0f;
    }
    public static void main(String[] args) throws Exception {
        Beaver b =  new Beaver();
        b.chew();
        chew();
    }

}