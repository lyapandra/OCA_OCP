package Roman4ik2015.Ch5p202Throwble.p217PolymorphException;

import java.text.ParseException;

/**
 * Created by a on 09.04.2018.
 */
public class StoneAction { // ранее созданный класс
    public void buildHouse(Stone stone) {
        try {
            stone.build("some info");
// предусмотрена обработка ParseException и его подклассов
        } catch(ParseException e) {
            System.err.print(e);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Stone s1 = new BlackStone();
        Stone s2 = new WhiteStone();
        StoneAction sa = new StoneAction();
        sa.buildHouse(s1);
        sa.buildHouse(s2);
    }
}