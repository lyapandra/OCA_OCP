package internet.statics.e1Static;

    class Vehicle {
//        public /*static*/ void kmToMiles(int km) {
        public static void kmToMiles(int km) {
            System.out.println("Внутри родительского класса/статического метода");
        }
    }

    class Car extends Vehicle {
//        public /*static*/ void kmToMiles(int km) {
        public static void kmToMiles(int km) {
            System.out.println("Внутри дочернего класса/статического метода ");
        }
    }

    public class Demo1 {
        public static void main(String args[]) {
            Vehicle v1 = new Car();
            Car v2 = new Car();
            Vehicle v3 = new Vehicle();
            v1.kmToMiles(10);
        }
    }

