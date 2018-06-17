package internet.generic.animon;
//Верхняя граница подстановки
import java.util.ArrayList;
import java.util.List;

public class DynamicSizedGarageMain01 {
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

        garage.forEach(car-> System.out.println(car.getName()));
//        Stream.of(garage).forEach(System.out.println());
//        System.out.println(garage.get(0).getName());
//        Motorcycle motorcycle1 = (Motorcycle) garage.get(0);
//        Motorcycle motorcycle2 = (Motorcycle) garage.get(1);
    }


}
