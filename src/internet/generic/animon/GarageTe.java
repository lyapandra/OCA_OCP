package internet.generic.animon;

public class GarageTe<T extends Vehicle> {
    private T vehicle;

    public T get() {
        return vehicle;
    }

    public void set(T vehicle) {
        this.vehicle = vehicle;
    }
}
