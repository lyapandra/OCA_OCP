package internet.generic.animon;

public class MainWithGeneric01 {
    public static void main(String[] args) {
        GarageTe<Car> garage1 = new GarageTe<>();
        garage1.set(new Car("Aston Martin"));
        Car car = (Car) garage1.get();
        System.out.println(car.getName()); // Aston Martin

        GarageTe<Motorcycle> garage2 = new GarageTe<>();
        garage2.set(new Motorcycle("Honda CBR500R"));
        Motorcycle motorcycle = (Motorcycle) garage2.get();
        System.out.println(motorcycle.getName());

        /*GarageTe<Jupiter> garage3 = new GarageTe<>();
        garage3.set(new Jupiter());
        Jupiter jupiter = garage3.get();
        System.out.println("jupiter = " + jupiter);*/
    }
}
