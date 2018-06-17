package internet.generic.animon;
//Но с массивом и дженериками есть ограничение - нельзя создать массив типа T. Зато можно привести любой другой массив к типу (T[]), но это небезопасно. Тем не менее, в данном случае всё будет работать.
public class FixedSizeGarageMain {
    public static void main(String[] args) {
        FixedSizeGarage<Car> garage = new FixedSizeGarage<>(2);
        garage.set(0, new Car("Aston Martin"));
        garage.set(1, new Car("Audi"));
        Car car1 = garage.get(0);
        System.out.println("car1.getName() = " + car1.getName());
        Car car2 = garage.get(1);
        System.out.println("car2.getName() = " + car2.getName());
    }
}
