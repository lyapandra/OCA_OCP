package internet.generic.animon;

public class FixedSizeGarage<T extends Vehicle> {

    private final T[] vehicles;

    @SuppressWarnings("unchecked")
    public FixedSizeGarage(int size) {
        // vehicles = new T[size];
        vehicles = (T[]) new Vehicle[size];
    }

    public T get(int index) {
        return vehicles[index];
    }

    public void set(int index, T vehicle) {
        this.vehicles[index] = vehicle;
    }
}
