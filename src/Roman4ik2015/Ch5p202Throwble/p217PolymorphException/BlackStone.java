package Roman4ik2015.Ch5p202Throwble.p217PolymorphException;

/**
 * Created by a on 09.04.2018.
 */
public class BlackStone extends Stone { // новый класс
    @Override
    public void build(String data) throws Exception { // ошибка компиляции
        System.out.println("черный каменный шар");
/* реализация*/
    }
}