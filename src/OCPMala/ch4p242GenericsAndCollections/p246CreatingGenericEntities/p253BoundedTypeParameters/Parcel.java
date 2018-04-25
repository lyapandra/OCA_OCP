package OCPMala.ch4p242GenericsAndCollections.p246CreatingGenericEntities.p253BoundedTypeParameters;

/**
 * Created by a on 25.04.2018.
 */
abstract class Gift{
    abstract double getWeight();
}

class Book extends Gift{
    @Override
    public double getWeight() {return 3.2;}
}
class Phone extends Gift{
    @Override
    public double getWeight() { return 1.1; }
}

class Parcel<T extends Gift>{
//class Parcel<T>{
    private T t;
    public void set(T t) {
        this.t = t;
    }
    public void shipParcel() {
        if (t.getWeight() > 3)
            System.out.println("Ship by courier ABC");
        else
            System.out.println("Ship by courier XYZ");
    }

    public static void main(String[] args) {

        Parcel<Book> parcelA = new Parcel();
        parcelA.set(new Book());
        parcelA.shipParcel();

        Parcel<Gift> parcelB = new Parcel();
//        Parcel<String> parcelB = new Parcel();
        parcelB.set(new Book());
        parcelB.set(new Phone());
        parcelB.shipParcel();
    }
}