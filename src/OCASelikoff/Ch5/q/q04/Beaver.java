package OCASelikoff.Ch5.q.q04;

import org.jetbrains.annotations.NotNull;

/**
 * Created by a on 07.04.2018.
 */
public class Beaver extends Rodent {
    @NotNull
//    public static Number chew() throws RuntimeException {
    public static Integer chew() throws RuntimeException {
        System.out.println("Beaver is chewing on wood");
        return 2;
    }
    public static void main(String[] args) throws Exception {
        Beaver b =  new Beaver();
        Rodent r = new Rodent();
        b.chew();
        System.out.println("b.chew(); = " + b.chew());
        r.chew();
        System.out.println("r.chew() = " + r.chew());
        chew();
        System.out.println("chew() = " + chew());
        
    }

}