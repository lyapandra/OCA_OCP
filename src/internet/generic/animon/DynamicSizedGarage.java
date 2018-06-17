package internet.generic.animon;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Consumer;

public class DynamicSizedGarage<T extends Vehicle> {

    private final List<T> vehicles;

    public DynamicSizedGarage() {
        vehicles = new ArrayList<>();
    }

    public void add(T t) {
        vehicles.add(t);
    }

    public T get(int index) {
        return vehicles.get(index);
    }

//    public void addAll(List<T> list) {
    public void addAll(List<? extends T> list) {
        vehicles.addAll(list);
    }

    public void forEach(Consumer<? super T> consumer) {
        for (T vehicle : vehicles) {
            consumer.accept(vehicle);
        }
    }

    public <U extends T> void addIf(
            List<? extends U> list, BiPredicate<? super T, ? super U> predicate) {
        List<U> candidatesToAdd = new ArrayList<>();
        Iterator<? extends U> it1 = list.iterator();
        Iterator<? extends T> it2 = vehicles.iterator();
        while (it1.hasNext() && it2.hasNext()) {
            U u = it1.next();
            T t = it2.next();
            if (predicate.test(t, u)) {
                candidatesToAdd.add(u);
            }
        }
        addAll(candidatesToAdd);
    }

}
