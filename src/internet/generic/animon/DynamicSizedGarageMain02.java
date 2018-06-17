package internet.generic.animon;
//Нижняя граница подстановки
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class DynamicSizedGarageMain02 {
    public static void main(String[] args) {


        List<Car> cars = new ArrayList<>();
        cars.add(new Car("carToyota"));
        cars.add(new Car("carJaguar"));
        cars.add(new Car("carBMW"));

        List<Truck> truks = new ArrayList<>();
        cars.add(new Car("trukToyota"));
        cars.add(new Car("trukJaguar"));
        cars.add(new Car("trukBMW"));

//        DynamicSizedGarage<Car> garage = new DynamicSizedGarage<>();
        DynamicSizedGarage<Vehicle> garage = new DynamicSizedGarage<>();
        garage.add(new Car("Aston Martin"));
        garage.addAll(cars);

        garage.addAll(cars);

        garage.add(new Motorcycle("Honda CBR500R"));
        garage.add(new Truck("Truck Harley-Davidson"));
        garage.addAll(truks);

//        garage.add(new Object());
        List<Object> objectList = new ArrayList<>();
        objectList.add(new Object());
        objectList.add(new Object());
//        garage.addAll(objectList);

        Consumer<Object> objectConsumer = object ->
            System.out.println(object.hashCode() + " " + String.valueOf(object.hashCode()).length());
        Consumer<Vehicle> vehicleConsumer = vehicle -> System.out.println(vehicle.getName());
        garage.forEach(objectConsumer);
//        garage.forEach(vehicleConsumer);

//        garage.forEach(car-> System.out.println(car.getName()));
    }
}
