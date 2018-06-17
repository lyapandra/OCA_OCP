package internet.generic.animon;

public class Main02 {
    public static void main(String[] args) {
        Car CAR = new Car("Aston Martin");
        Motorcycle MOTORCYCLE = new Motorcycle("Honda CBR500R");
        Truck TRUCK = new Truck("Road Kill");

        TripleGarage<Car, Motorcycle, Truck> garage1 = new TripleGarage<>();
        garage1.set1(CAR);
        garage1.set2(MOTORCYCLE);
        garage1.set3(TRUCK);

        TripleGarage<Car, Motorcycle, Truck> garage2 = new TripleGarage<>();
        garage2.set1(TRUCK);
        garage2.set2(MOTORCYCLE);
        garage2.set3(TRUCK);
//        Car car1 = garage2.get1();
        Truck car1 = (Truck) garage2.get1();
        System.out.println("car1.getName() = " + car1.getName());

        TripleGarage<Car, Car, Car> garage3 = new TripleGarage<>();
        garage3.set1(CAR);
        garage3.set2(CAR);
        garage3.set3(CAR);
    }
}
