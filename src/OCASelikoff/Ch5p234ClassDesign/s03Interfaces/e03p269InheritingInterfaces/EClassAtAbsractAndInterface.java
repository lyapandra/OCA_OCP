package OCASelikoff.Ch5p234ClassDesign.s03Interfaces.e03p269InheritingInterfaces;

/**
 * Created by a on 07.04.2018.
 */
public class EClassAtAbsractAndInterface extends E2HarborSealAbstract implements E1SealInterface{
    @Override
    public int getTailLength() {
        return 0;
    }

    @Override
    public int getNumberOfWhiskers() {
        return 0;
    }
}
