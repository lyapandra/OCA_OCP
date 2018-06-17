package internet.generic.animon;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static java.lang.System.*;

public class DynamicSizedGarageMain {
    public static void main(String[] args) {

        List<Vehicle> cars = new ArrayList<>();
        cars.add(new Car("Toyota"));
        cars.add(new Car("Jaguar"));
        cars.add(new Car("BMW"));

        DynamicSizedGarage<Vehicle> garage = new DynamicSizedGarage<>();
        garage.add(new Car("Aston Martin"));
        garage.addAll(cars);
        garage.add(new Motorcycle("Honda CBR500R"));
        garage.add(new Motorcycle("Harley-Davidson"));

        garage.forEach(car-> System.out.println(Car.class));
//        Stream.of(garage).forEach(System.out.println());
//        System.out.println(garage.get(0).getName());
//        Motorcycle motorcycle1 = (Motorcycle) garage.get(0);
//        Motorcycle motorcycle2 = (Motorcycle) garage.get(1);
    }


}
