//package OCPMala.ch4p242GenericsAndCollections.p246CreatingGenericEntities.p261TypeErasure;

/**
 * Created by a on 25.04.2018.
 */
class Parcel<T>{
    private T t;
    public void set(T t) {
        this.t = t;
    }
    public T get() {
        return t;
    }

    public static void main(String[] args) {
        Parcel<String> p = new Parcel<String>();
        p.set("a");
        System.out.println("p.get() = " + p.get());
    }
}