package internet.generic.animon;

public class MainNoGeneric {
    public static void main(String[] args) {
        Garage garage = new Garage();
        garage.set(new Car("Aston Martin"));
        Car car = (Car) garage.get();
        System.out.println(car.getName()); // Aston Martin

        Garage garage2 = new Garage();
        garage2.set(new Motorcycle("Honda CBR500R"));
        Motorcycle motorcycle = (Motorcycle) garage.get();
        System.out.println(motorcycle.getName());

    }
}
