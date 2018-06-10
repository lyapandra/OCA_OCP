package internet.javastudy.ru.interview.type.q08;

public class Primitive {
    public static void main(String[] args) {
        int x= 5;
        int y = changeX(5);
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        System.out.println("============");
        Integer a = 5;

        Dog myDog = new Dog("Ball");
        System.out.println("myDog = " + myDog);
        System.out.println("myDog.getName() = " + myDog.getName());
        Dog nextDog = foo(myDog);
        System.out.println("nextDog.getName() = " + nextDog.getName());
        System.out.println("myDog.getName() = " + myDog.getName());
    }

    private static Dog foo(Dog someDog) {

        System.out.println("someDog = " + someDog);
        System.out.println("someDog.getName() = " + someDog.getName()); //Ball
        someDog.setName("Max");     // AAA
        someDog = new Dog("Fifi");  // BBB
        someDog.setName("Rowlf");   // CCC
        System.out.println("someDog.getName() = " + someDog.getName());
        return someDog;
    }


    private static int changeX(int xx) {
        xx++;
        System.out.println("xx = " + xx);
        return xx*5;
    }
}
