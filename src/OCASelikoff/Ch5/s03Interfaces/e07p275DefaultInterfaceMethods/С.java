package OCASelikoff.Ch5.s03Interfaces.e07p275DefaultInterfaceMethods;

import OCASelikoff.Ch5.s03Interfaces.e06p273InterfaceVariables.C;

/**
 * Created by a on 07.04.2018.
 */
public class С implements E3SharkFamily {
    @Override
    public int getNumberOfFins() {
        return 0;
    }
    @Override
    public double getLongestFinLength() {
        return 0;
    }

    @Override
    public boolean doFinsHaveScales() {
        return false;
    }

    public static void main(String[] args) {
        C c = new C();
//        int i = c.getNumberOfFins(); //?
    }
}
