package OCPSelikoff.chapter3.generics.types;

/**
 * Created by Serhii K. on 2/9/2016.
 */
// RAW TYPE
public class SizeLimitedCrate<T, U> {
    private T contents;
    private U sizeLimit;

    public SizeLimitedCrate(T contents, U sizeLimit) {
        this.contents = contents;
        this.sizeLimit = sizeLimit;
    }

    public U getSizeLimit() {
//    public String getSizeLimit() {
        return sizeLimit;
//        return sizeLimit.toString();
    }
public T getContents() {
//    public String getSizeLimit() {
        return contents;
//        return sizeLimit.toString();
    }

    @Override
    public String toString() {
        return "SizeLimitedCrate{" +
                "contents=" + contents.getClass().getSimpleName() +
                ", sizeLimit=" + sizeLimit +
                '}';
    }

    public static void main(String[] args) {

        Elephant elephant1 = new Elephant();
        Crate<Elephant> crateForElephant = new Crate<>();
        crateForElephant.packCrate(elephant1);
        System.out.println(crateForElephant.getClassName());
//        Elephant inNewHome = crateForElephant.emptyCrate();

        Elephant elephant = new Elephant();
        Integer numPounds = 15_000;
        SizeLimitedCrate<Elephant, Integer> c1 =
                new SizeLimitedCrate<>(elephant, numPounds);
        System.out.println(c1);

        Robot robot = new Robot();
        SizeLimitedCrate<Robot, Integer> r1 =
                new SizeLimitedCrate<>(robot, 10);
        System.out.println(r1);

    }
}

class Elephant {}
class Robot {}
class Zebra {}
